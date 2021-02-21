package by.teachmeskills.taxes.model;

import by.teachmeskills.taxes.model.laws.ComplexTaxLaw;
import by.teachmeskills.taxes.model.laws.PercentInRangeLaw;

import java.util.List;

public class CalculateTaxes {

    public static void main(String[] args) {
        double basePayInBelarus = 25; //базовая величина в РБ
        TaxLaw belarusIncomeTax = new ComplexTaxLaw(List.of(
                new PercentInRangeLaw(9, 0, 240 * basePayInBelarus),
                new PercentInRangeLaw(15, 240 * basePayInBelarus, 600 * basePayInBelarus),
                new PercentInRangeLaw(20, 600 * basePayInBelarus, 840 * basePayInBelarus),
                new PercentInRangeLaw(25, 840 * basePayInBelarus, 1080 * basePayInBelarus),
                new PercentInRangeLaw(30, 1080 * basePayInBelarus, Double.MAX_VALUE)
        ));

        Salary superSalary = new SimpleSalary(650 * basePayInBelarus, belarusIncomeTax);
        for (Tax tax : superSalary.taxes()) {
            System.out.println(tax);
        }
        System.out.println();
        System.out.println("Salary: " + superSalary.total());
        double taxes = superSalary.taxes().stream().mapToDouble(t -> t.amount()).sum();
        System.out.println("Total by.teachmeskills.taxes: " + taxes);
        System.out.println("On hands: " + (superSalary.total() - taxes));
    }
}

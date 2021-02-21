package by.teachmeskills.taxes.model.laws;

import by.teachmeskills.taxes.model.Salary;
import by.teachmeskills.taxes.model.Tax;
import by.teachmeskills.taxes.model.TaxLaw;

import java.util.Collections;
import java.util.List;

public class BelarusRegionCoefficient implements TaxLaw {

    private final TaxLaw law;


    public BelarusRegionCoefficient(TaxLaw law) {
        this.law = law;
    }


    @Override
    public List<Tax> calculateTaxesFor(Salary salary) {
        double amount = law.calculateTaxesFor(salary).stream().mapToDouble(t -> t.amount()).sum();
        double coefficient;
        List<String> regions = List.of("Витебск", "Гродно", "Могилёв", "Брест", "Гомель");
        if ("Минск".equals(salary.worker().region())) {
            coefficient = 1.05;
        } else if (regions.contains(salary.worker().region())) {
            coefficient = 0.95;
        } else {
            coefficient = 1;
        }
        return Collections.singletonList(new SimpleTax(amount * coefficient, this));
    }
}

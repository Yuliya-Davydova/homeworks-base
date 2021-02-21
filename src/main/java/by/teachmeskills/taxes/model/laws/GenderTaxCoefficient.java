package by.teachmeskills.taxes.model.laws;

import by.teachmeskills.taxes.model.Gender;
import by.teachmeskills.taxes.model.Salary;
import by.teachmeskills.taxes.model.Tax;
import by.teachmeskills.taxes.model.TaxLaw;

import java.util.Collections;
import java.util.List;

public class GenderTaxCoefficient implements TaxLaw {

    private final TaxLaw law;


    public GenderTaxCoefficient(TaxLaw law) {
        this.law = law;
    }


    @Override
    public List<Tax> calculateTaxesFor(Salary salary) {
        List<Tax> taxes = law.calculateTaxesFor(salary);

        double amount = taxes.stream().mapToDouble(t -> t.amount()).sum();
        if (salary.worker().gender() == Gender.Female) {
            return Collections.singletonList(new SimpleTax(amount * 0.95, this));
        } else {
            return taxes;
        }
    }
}




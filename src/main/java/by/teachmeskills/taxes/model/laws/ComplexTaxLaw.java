package by.teachmeskills.taxes.model.laws;

import by.teachmeskills.taxes.model.Salary;
import by.teachmeskills.taxes.model.Tax;
import by.teachmeskills.taxes.model.TaxLaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComplexTaxLaw implements TaxLaw {

    private final List<TaxLaw> laws;


    public ComplexTaxLaw(TaxLaw law) {
        this(Collections.singletonList(law));
    }

    public ComplexTaxLaw(List<TaxLaw> laws) {
        this.laws = laws;
    }


    @Override
    public List<Tax> calculateTaxesFor(Salary salary) {
        List<Tax> result = new ArrayList<>();
        for (TaxLaw law : laws) {
            result.addAll(law.calculateTaxesFor(salary));
        }
        return result;
    }
}

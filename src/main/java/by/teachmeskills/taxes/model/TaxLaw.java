package by.teachmeskills.taxes.model;

import java.util.List;

public interface TaxLaw {

    List<Tax> calculateTaxesFor(Salary salary);
}

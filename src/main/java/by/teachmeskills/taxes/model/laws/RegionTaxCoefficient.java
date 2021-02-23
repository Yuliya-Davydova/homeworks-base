package by.teachmeskills.taxes.model.laws;

import by.teachmeskills.taxes.model.Salary;
import by.teachmeskills.taxes.model.Tax;
import by.teachmeskills.taxes.model.TaxLaw;

import java.util.Collections;
import java.util.List;

public class RegionTaxCoefficient implements TaxLaw {

    private final String region;
    private final int coefficient;
    private final TaxLaw law;


    /**
     * @param region      Название региона
     * @param coefficient Коэффициент региона, от -100 до 100
     * @param law         На какие налоги применять поправку
     */
    public RegionTaxCoefficient(String region, int coefficient, TaxLaw law) {
        this.region = region;
        this.coefficient = coefficient;
        this.law = law;
    }


    @Override
    public List<Tax> calculateTaxesFor(Salary salary) {
        List<Tax> taxes = law.calculateTaxesFor(salary);
        double amount = taxes.stream().mapToDouble(t -> t.amount()).sum();
        if (region.equals(salary.worker().region())) {
            return List.of(new SimpleTax(amount * coefficient / 100, this));
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public String toString() {
        return "RegionTaxCoefficient{" +
                "region='" + region + '\'' +
                ", coefficient=" + coefficient +
                '}';
    }
}

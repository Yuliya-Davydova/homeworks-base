package by.teachmeskills.taxes.model.laws;

import by.teachmeskills.taxes.model.Gender;
import by.teachmeskills.taxes.model.Salary;
import by.teachmeskills.taxes.model.Tax;
import by.teachmeskills.taxes.model.TaxLaw;

import java.util.Collections;
import java.util.List;

public class GenderTaxCoefficient implements TaxLaw {

    private final Gender gender;
    private final int coefficient;
    private final TaxLaw law;


    /**
     * @param gender      Пол работника
     * @param coefficient Коэффициент на пол, от -100 до 100
     * @param law         На какие налоги применять поправку
     */
    public GenderTaxCoefficient(Gender gender, int coefficient, TaxLaw law) {
        this.gender = gender;
        this.coefficient = coefficient;
        this.law = law;
    }


    @Override
    public List<Tax> calculateTaxesFor(Salary salary) {
        List<Tax> taxes = law.calculateTaxesFor(salary);
        double amount = taxes.stream().mapToDouble(t -> t.amount()).sum();
        if (gender.equals(salary.worker().gender())) {
            return List.of(new SimpleTax(amount * coefficient / 100, this));
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public String toString() {
        return "GenderTaxCoefficient{" +
                "gender=" + gender +
                ", coefficient=" + coefficient +
                '}';
    }
}




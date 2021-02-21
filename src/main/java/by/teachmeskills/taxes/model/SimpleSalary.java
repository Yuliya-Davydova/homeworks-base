package by.teachmeskills.taxes.model;

import java.util.List;

public class SimpleSalary implements Salary {

    private final Worker worker;
    private final double totalAmount;
    private final TaxLaw taxLaw;


    public SimpleSalary(double totalAmount, TaxLaw taxLaw) {
        this(new SimpleWorker("", "", Gender.Male, ""), totalAmount, taxLaw);
    }

    public SimpleSalary(Worker worker, double totalAmount, TaxLaw taxLaw) {
        this.worker = worker;
        this.totalAmount = totalAmount;
        this.taxLaw = taxLaw;
    }

    @Override
    public Worker worker() {
        return worker;
    }

    @Override
    public double total() {
        return totalAmount;
    }

    @Override
    public List<Tax> taxes() {
        return taxLaw.calculateTaxesFor(this);
    }
}

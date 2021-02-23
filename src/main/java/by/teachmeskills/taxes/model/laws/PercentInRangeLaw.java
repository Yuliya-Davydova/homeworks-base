package by.teachmeskills.taxes.model.laws;

import by.teachmeskills.taxes.model.Salary;
import by.teachmeskills.taxes.model.Tax;
import by.teachmeskills.taxes.model.TaxLaw;

import java.util.List;

public class PercentInRangeLaw implements TaxLaw {

    private final double percent;
    private final double minSum;
    private final double maxSum;


    public PercentInRangeLaw(double percent, double minSum, double maxSum) {
        this.percent = percent;
        this.minSum = minSum;
        this.maxSum = maxSum;
    }


    @Override
    public List<Tax> calculateTaxesFor(Salary salary) {
        if (salary.total() >= minSum) {
            double payment = (Math.min(salary.total(), maxSum) - minSum) * percent / 100;
            return List.of(new SimpleTax(payment, this));
        } else {
            return List.of(new SimpleTax(0, this));
        }
    }

    @Override
    public String toString() {
        return "PercentInRangeLaw{" +
                "percent=" + percent +
                ", minSum=" + minSum +
                ", maxSum=" + maxSum +
                '}';
    }
}

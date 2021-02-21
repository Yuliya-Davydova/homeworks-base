package by.teachmeskills.taxes.model.laws;

import by.teachmeskills.taxes.model.Tax;
import by.teachmeskills.taxes.model.TaxLaw;

public class SimpleTax implements Tax {

    private final double amount;
    private final TaxLaw law;


    public SimpleTax(double amount, TaxLaw law) {
        this.amount = amount;
        this.law = law;
    }


    @Override
    public double amount() {
        return amount;
    }

    @Override
    public TaxLaw law() {
        return law;
    }

    @Override
    public String toString() {
        return "SimpleTax{" +
                "amount=" + amount +
                ", law=" + law +
                '}';
    }
}

package by.teachmeskills.taxes.model;

import java.util.List;

public interface Salary {

    Worker worker();

    double total();

    List<Tax> taxes();
}

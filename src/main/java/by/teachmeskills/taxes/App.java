package by.teachmeskills.taxes;


import by.teachmeskills.taxes.model.*;
import by.teachmeskills.taxes.model.laws.BelarusRegionCoefficient;
import by.teachmeskills.taxes.model.laws.ComplexTaxLaw;
import by.teachmeskills.taxes.model.laws.GenderTaxCoefficient;
import by.teachmeskills.taxes.model.laws.PercentInRangeLaw;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet
public class App extends HttpServlet {

    private final double basePayInBelarus;
    private final TaxLaw law;
    private final List<Salary> salaries = new ArrayList<>();

    public App() {
        this.basePayInBelarus = 26;
        TaxLaw incomeTaxLaw = new ComplexTaxLaw(List.of(
                new PercentInRangeLaw(9, 0, 240 * basePayInBelarus),
                new PercentInRangeLaw(15, 240 * basePayInBelarus, 600 * basePayInBelarus),
                new PercentInRangeLaw(20, 600 * basePayInBelarus, 840 * basePayInBelarus),
                new PercentInRangeLaw(25, 840 * basePayInBelarus, 1080 * basePayInBelarus),
                new PercentInRangeLaw(30, 1080 * basePayInBelarus, Double.MAX_VALUE)
        ));
        this.law = new BelarusRegionCoefficient(new GenderTaxCoefficient(incomeTaxLaw));
    }

    /**
     * @param firstName Имя работника
     * @param lastName  Фамилия работника
     * @param gender    Пол работника
     * @param region    Регион Беларуси
     * @param salary    Зарплата в рублях
     */
    private void addSalary(String firstName, String lastName, Gender gender, String region, double salary) {
        salaries.add(new SimpleSalary(new SimpleWorker(firstName, lastName, gender, region), salary, law));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

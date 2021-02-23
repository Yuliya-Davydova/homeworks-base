package by.teachmeskills.taxes;


import by.teachmeskills.taxes.model.*;
import by.teachmeskills.taxes.model.laws.RegionTaxCoefficient;
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
        this.basePayInBelarus = 14000;
        TaxLaw incomeTaxLaw = new ComplexTaxLaw(List.of(
                new PercentInRangeLaw(9, 0, 240 * basePayInBelarus),
                new PercentInRangeLaw(15, 240 * basePayInBelarus, 600 * basePayInBelarus),
                new PercentInRangeLaw(20, 600 * basePayInBelarus, 840 * basePayInBelarus),
                new PercentInRangeLaw(25, 840 * basePayInBelarus, 1080 * basePayInBelarus),
                new PercentInRangeLaw(30, 1080 * basePayInBelarus, Double.MAX_VALUE)
        ));
        this.law = new ComplexTaxLaw(
                incomeTaxLaw,
                new RegionTaxCoefficient("Минск", 5, incomeTaxLaw),
                new RegionTaxCoefficient("Витебск", -5, incomeTaxLaw),
                new RegionTaxCoefficient("Гродно", -5, incomeTaxLaw),
                new RegionTaxCoefficient("Гомель", -5, incomeTaxLaw),
                new RegionTaxCoefficient("Бресть", -5, incomeTaxLaw),
                new RegionTaxCoefficient("Могилёв", -5, incomeTaxLaw),
                new GenderTaxCoefficient(Gender.Female, -5, incomeTaxLaw)
        );
    }

    public static void main(String[] args) {
        new App().run();
    }

    public void run() {
        Worker worker = new SimpleWorker("", "", Gender.Female, "Минск");
        Salary superSalary = new SimpleSalary(worker, 9100000, law);
        for (Tax tax : superSalary.taxes()) {
            System.out.println(tax);
        }
        System.out.println();
        System.out.println("Salary: " + superSalary.total());
        double taxes = superSalary.taxes().stream().mapToDouble(t -> t.amount()).sum();
        System.out.println("Total taxes: " + taxes);
        System.out.println("On hands: " + (superSalary.total() - taxes));
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

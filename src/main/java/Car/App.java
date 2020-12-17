package Car;

import java.util.*;

public class App {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("BWM", 180, 300),
                new Car("Citroen", 210, 200),
                new Car("Жигуль", 9000, 3)
        );

        for (Car car : cars) {
            try {
                car.start();
                System.out.println("'" + car.getBrand() + "' started successfully");
            } catch (CarStartException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


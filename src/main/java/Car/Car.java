package Car;

import java.util.Random;

public class Car {
    private String brand;
    private double speed; //speed in km/h
    private double price; //price in usd ($)

    public Car() {
    }

    public Car(String brand, double speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }


    //region getters/setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //endregion

    public void start() throws CarStartException {
        Random random = new Random();
        int value = random.nextInt(20);
        if (value % 2 == 0) {
            throw new CarStartException(
                    String.format("Failed to start '%s' car with speed '%s' and price '%s'", brand, speed, price)
            );
        }
    }
}

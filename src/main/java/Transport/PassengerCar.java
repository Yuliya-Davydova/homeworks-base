package Transport;

public class PassengerCar extends LandTransport {
    String bodyType;
    int numberOfPassengers;

    public String param() {
        return ("Кузов: " + bodyType + ", количество пассажиров (шт): " + numberOfPassengers +
                ", количество колес (шт): " + numberWhels + ", расход топлива (л/100км): " + fuelConsumptionPer100km +
                ", мощность (л.с.): " + power + "Мощность (кВт): " + PowerKVt() + ", максимальная скорость (км/ч)"
                + speed + "масса (кг): " + weight + ", марка: " + brand);
    }

    public void printDistance(double durationInHour) {
        double distance = speed * durationInHour;
        System.out.println("За время " + durationInHour + " ч." + " автомобиль " + brand +
                " двигаясь с максимальной скоростью " + speed + " км/ч" + " проедет " + distance +
                " км и израсходует " + fuel(distance) + " литров топлива.");
    }

    private double fuel(double distance) {
        double fuelConsumption = distance / 100 * fuelConsumptionPer100km;
        return (fuelConsumption);
    }
}

package Transport;

public class PassengerCar extends LandTransport {
    String bodyType;
    int numberOfPassengers;

    public String param() {
        return ("Кузов: " + bodyType + ", количество пассажиров (шт): " + numberOfPassengers +
                ", количество колес (шт): " + numberWhels + ", расход топлива (л/100км): " + fuel +
                ", мощность (л.с.): " + power + "Мощность (кВт): " + PowerKVt() + ", максимальная скорость (км/ч)"
                + speed + "масса (кг): " + weight + ", марка: " + brand);
    }

    public void distance(int min) {

    }
}

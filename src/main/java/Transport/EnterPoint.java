package Transport;

public class EnterPoint {
    public static void main(String[] args) {
        PassengerCar tp1 = new PassengerCar();
        tp1.speed = 90;
        tp1.fuelConsumptionPer100km = 5;
        tp1.printDistance(1.5);

        tp1.param();
        String passengerCarParam = tp1.param();
        System.out.println(passengerCarParam);

    }
}

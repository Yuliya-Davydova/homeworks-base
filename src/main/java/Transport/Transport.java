package Transport;

public class Transport {
    int power;
    int speed;
    int weight;
    String brand;

    static class LandTransport {
        int numberWhels;
        int fuel;

        static class PassengerCar {
            String bodyType;
            int numberOfPassengers;
        }

        static class FreightTransport {
            int liftingCapacity;
        }
    }

    static class AirTransport {
        int wingspan;
        int runwayLength;

        static class CivilTransport {
            int numberOfPassengers;
            boolean businessClass;
        }

        static class Military {
            boolean bailout;
            int numberOfMissiles;
        }
    }
}

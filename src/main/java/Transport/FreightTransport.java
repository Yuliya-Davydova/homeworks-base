package Transport;

public class FreightTransport extends LandTransport {
    int liftingCapacity;

    public String param() {
        return ("Грузоподъемность (т): " + liftingCapacity + ", количество колес (шт): " + numberWhels +
                ", расход топлива (л/100км): " + fuel + ", мощность (л.с.): " + power + "Мощность (кВт): " + PowerKVt() +
                ", максимальная скорость (км/ч)" + speed + "масса (кг): " + weight + ", марка: " + brand);
    }
}

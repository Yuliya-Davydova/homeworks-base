package Transport;

public class CivilTransport extends AirTransport {
    int numberOfPassengers;
    boolean businessClass;

    public String param() {
        return ("Количество пассажиров (шт): " + numberOfPassengers + ", бизнес класс: " + businessClass +
                ", размах крыльев (м): " + wingspan +
                "Минимальная длина взлётно-посадочной полосы для взлёта: " + runwayLength + ", мощность (л.с.): "
                + power + "Мощность (кВт): " + PowerKVt() + ", максимальная скорость (км/ч)"
                + ", максимальная скорость (км/ч)" + speed + "масса (кг): " + weight + ", марка: " + brand);
    }
}

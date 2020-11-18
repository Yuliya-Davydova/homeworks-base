package Transport;

public class MilitaryTransport extends AirTransport {
    boolean bailout;
    int numberOfMissiles;

    public String param() {
        return ("Наличие системы катапультирования: " + bailout +
                ", количество ракет на борту: " + numberOfMissiles +
                ", размах крыльев (м): " + wingspan +
                "минимальная длина взлётно-посадочной полосы для взлёта: " + runwayLength +
                ", мощность (л.с.): " + power + "Мощность (кВт): " + PowerKVt() + ", максимальная скорость (км/ч)" +
                ", максимальная скорость (км/ч)" + speed + "масса (кг): " + weight + ", марка: " + brand);
    }
}

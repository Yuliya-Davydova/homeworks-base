package Human.pants;

public class SkiPants implements IPants {

    public SkiPants() {

    }

    @Override
    public void putOn() {
        System.out.println("Надеть лыжные штаны");

    }

    @Override
    public void putOff() {
        System.out.println("Снять лыжные штаны");

    }
}

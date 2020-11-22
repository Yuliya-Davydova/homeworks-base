package Human.pants;

public class SummerPants implements IPants {

    public SummerPants() {

    }

    @Override
    public void putOn() {
        System.out.println("Надеть летние штаны");
    }

    @Override
    public void putOff() {
        System.out.println("Снять летние штаны");
    }
}

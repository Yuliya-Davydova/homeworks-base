package Human.jacket;

public class SummerJacket implements IJacket {

    public SummerJacket() {

    }

    @Override
    public void putOn() {
        System.out.println("Надеть летнюю куртку");

    }

    @Override
    public void putOff() {
        System.out.println("Снять летнюю куртку");


    }
}

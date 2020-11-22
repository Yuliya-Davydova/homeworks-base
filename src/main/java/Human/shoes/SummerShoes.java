package Human.shoes;

public class SummerShoes implements IShoes {

    public SummerShoes() {

    }

    @Override
    public void putOn() {
        System.out.println("Надеть летние ботинки");
    }

    @Override
    public void putOff() {
        System.out.println("Снять летние ботинки");
    }
}

package Human.shoes;

public class SkiShoes implements IShoes {

    public SkiShoes() {

    }

    @Override
    public void putOn() {
        System.out.println("Надеть лыжные ботинки");
    }

    @Override
    public void putOff() {
        System.out.println("Снять лыжные ботинки");
    }
}

package Human.jacket;


public class SkiJacket implements IJacket {

    public SkiJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Надеть лыжную куртку");

    }

    @Override
    public void putOff() {
        System.out.println("Снять лыжную куртку");

    }
}



package Human;

import Human.jacket.IJacket;
import Human.pants.IPants;
import Human.shoes.IShoes;


public class Human implements IHuman {
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;
    private String name;

    public Human(IJacket jacket, IPants pants, IShoes shoes, String name) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
        this.name = name;
    }

    @Override
    public void putOn() {
        System.out.println("Человек " + name + " одевается:");
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void putOff() {
        System.out.println("Человек " + name + " раздевается:");
        jacket.putOff();
        pants.putOff();
        shoes.putOff();
    }
}

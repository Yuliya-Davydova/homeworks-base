package Human;

import Human.jacket.SkiJacket;
import Human.jacket.SummerJacket;
import Human.pants.SkiPants;
import Human.pants.SummerPants;
import Human.shoes.SkiShoes;
import Human.shoes.SummerShoes;

public class RunHuman {
    public static void main(String[] args) {
        Human human = new Human(new SkiJacket(), new SkiPants(), new SkiShoes(), "на Севере");
        Human human1 = new Human(new SummerJacket(), new SummerPants(), new SummerShoes(), "на Юге");
        System.out.println();
        human.putOn();
        human.putOff();
        System.out.println();
        human1.putOn();
        human1.putOff();

    }
}

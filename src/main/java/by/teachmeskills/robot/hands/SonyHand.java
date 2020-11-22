package by.teachmeskills.robot.hands;

import by.teachmeskills.robot.heads.IHead;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Sony поднимает руку.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}


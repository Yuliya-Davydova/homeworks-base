package by.teachmeskills.robot.legs;

import by.teachmeskills.robot.heads.IHead;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Sony делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}


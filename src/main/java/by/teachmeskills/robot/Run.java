package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        IHead sonyHead = new SonyHead(5);
        IHand sonyHand = new SonyHand(10);
        ILeg sonyLeg = new SonyLeg(3);

        Robot robot1 = new Robot(sonyHead, sonyHand, sonyLeg);
        Robot robot2 = new Robot(new ToshibaHead(2), new ToshibaHand(7), new ToshibaLeg(11));
        Robot robot3 = new Robot(new SamsungHead(4), new SamsungHand(9), new SamsungLeg(15));

        robot1.action();
        System.out.println("Цена: " + robot1.getPrice());

        robot2.action();
        System.out.println("Цена: " + robot2.getPrice());

        robot3.action();
        System.out.println("Цена: " + robot3.getPrice());

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Робот Sony дороже, чем роботы Toshiba и Samsung.");
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Робот Toshiba дороже, чем роботы Sony и Samsung.");
        } else {
            System.out.println("Робот Samsung дороже, чем роботы Sony и Toshiba.");
        }
    }
}

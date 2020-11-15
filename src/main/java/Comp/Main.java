package Comp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 или 0 для включения.");
        int enter = Integer.parseInt(scanner.nextLine());
        Computer param = new Computer("My", 8, 254, 2);
        param.displayInfo();
        param.turnOn();
    }
}

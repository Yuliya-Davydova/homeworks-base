package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 3;
        int n = 3;

        int mass[][] = new int[n][m];

        for (int step = 0; step < 9; step++) {
            // ввести координату
            int A = Integer.parseInt(scanner.nextLine());
            int B = Integer.parseInt(scanner.nextLine());
            // кто ходит четный - Х, нечетный - О
            int metka;
            if (step % 2 == 1) {
                metka = 1;
            } else {
                metka = 2;
            }
            // проверка на занятость ячейки
            if (mass[A][B] == 0) {
                // вводим Х\О в ячейку
                mass[A][B] = metka;
            } else {
                System.out.println("Ошибка! Ячейка занята.");
            }
            // выводим матрицу
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(mass[i][j] + " ");
                }
                System.out.println();
            }
            // проверить комбинации выигрыша
        }
    }
}
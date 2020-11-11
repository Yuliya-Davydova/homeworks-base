package org.example;

import java.util.Random;
import java.util.Scanner;


public class Task2 {

    public static void main(String[] args) {
        System.out.println("Введите размер массива  MxN");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 0;
        int n = 0;

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
        }
        if (n == m) {
            int mass[][] = new int[n][m];
            for (int i = 0; i < n; i++) { //Заполнение массива случайными числами от 0 до 9
                for (int j = 0; j < m; j++) {
                    mass[i][j] = random.nextInt(9);
                }
            }
            System.out.println("Вывод массива:");
            for (int i = 0; i < n; i++) {// вывод массива в консоль
                for (int j = 0; j < m; j++) {
                    System.out.print(mass[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int transp = mass[i][j];
                    mass[i][j] = mass[j][i];
                    mass[j][i] = transp;
                }
            }
            System.out.println();
            System.out.println("Новая матрица");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mass[j][i] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Ошибка! Введите числа, чтобы получилась квадратная матрица: M должно равняться N");
        }
    }
}


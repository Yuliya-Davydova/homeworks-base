package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class App {

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
            for (int i = 0; i < n; i++) { //Заполнение массива случайными числами от 0 до 50
                for (int j = 0; j < m; j++) {
                    mass[i][j] = random.nextInt(9);
                }
            }
            for (int i = 0; i < n; i++) {// вывод массива в консоль
                for (int j = 0; j < m; j++) {
                    System.out.print(mass[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {// вывод главной диагонали массива в консоль
                for (int j = 0; j < m; j++) {
                    if (mass[i] == mass[j]) {
                        System.out.print(mass[i][j]);
                    }
                }
            }
            for (int i = n - 1; i < n; i++) { // вывод чисел под диагональю, оказалось выводит только нижний левый угол(((
                for (int j = m - 1 - i; j >= 0; j--) {
                    System.out.print(mass[i][j]);
                }
            }
            System.out.println();
            for (int i = 0; i < n; i++) { // вывод главной диагонали и всех чисел под диагональю
                for (int j = 0; j <= i; j++) {
                    System.out.print(mass[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Ошибка! Введите числа, чтобы получилась квадратная матрица: M должно равняться N");
        }
    }
}

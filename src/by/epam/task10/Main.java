package by.epam.task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = array[j].length - j;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
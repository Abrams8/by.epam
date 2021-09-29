package by.epam.task8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = in.nextInt();
        System.out.println("Введите K: ");
        int k = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i<array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i]%k==0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма равна: " +  sum);

    }
}

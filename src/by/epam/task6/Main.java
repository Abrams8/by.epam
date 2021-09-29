package by.epam.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = in.nextInt();
        System.out.println("Введите b: ");
        int b = in.nextInt();
        System.out.println("Введите c: ");
        int c = in.nextInt();

        if (a > b && a > c) {
            sum = sum + a;
        } else if (a < b && a < c) {
            sum = sum + a;
        }

        if (b > a && b > c) {
            sum = sum + b;
        } else if (b < a && b < c) {
            sum = sum + b;
        }

        if (c > a && c > b) {
            sum = sum + c;
        } else if (c < a && c < b) {
            sum = sum + c;
        }
        System.out.println(sum);
    }
}
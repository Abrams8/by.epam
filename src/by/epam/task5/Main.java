package by.epam.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = in.nextInt();
        System.out.println("Введите b: ");
        int b = in.nextInt();
        System.out.println("Введите c: ");
        int c = in.nextInt();
        if (a > 0) {
            a = (int)Math.pow(a, 2);
        } else {
            a = (int)Math.pow(a, 4);
        }
        if (b > 0) {
            b = (int)Math.pow(b, 2);
        } else {
            b = (int)Math.pow(b, 4);
        }
        if (c > 0) {
            c = (int)Math.pow(c, 2);
        } else {
            c = (int)Math.pow(c, 4);
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
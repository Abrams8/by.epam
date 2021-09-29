package by.epam.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = in.nextInt();
        System.out.println("Введите b: ");
        int b = in.nextInt();
        System.out.println("Введите c: ");
        int c = in.nextInt();

        result = ((b + (Math.sqrt((Math.pow(b,2)) + (4*a*c)))) / (2*a)) - (Math.pow(a, 3)*c) + (Math.pow(b, -2));
        System.out.println(result);
    }
}

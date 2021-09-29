package by.epam.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double square;
        double perimeter;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину катета a: ");
        double a = in.nextInt();
        System.out.println("Введите длину катета b: ");
        double b = in.nextInt();
        square = 0.5 * a * b;
        perimeter = (Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)))) + a + b;
        System.out.println("Площадь = " + square);
        System.out.println("Периметр = " + perimeter);
    }
}

package by.epam.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = in.nextDouble();
        System.out.println("Введите b: ");
        double b = in.nextDouble();
        System.out.println("Введите шаг h: ");
        double h = in.nextDouble();

        double x = a;
        for (; x <= b; x = x + h) {
          double y = (Math.pow((Math.sin(x)),2)) - (Math.cos((2*x)));
            System.out.println(x + "\t\t" + y);
        }
    }
}
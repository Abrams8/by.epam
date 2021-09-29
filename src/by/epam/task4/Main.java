package by.epam.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean result;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = in.nextInt();
        System.out.println("Введите y: ");
        int y = in.nextInt();
        if (x <= 2 && x >= -2 && y <= 4 && y >= -3) {
            result = true;
        } else if (x <= 4 && x >= -4 && y <= 0 && y >= -3) {
            result = true;
        } else result = false;
        System.out.println(result);
    }
}
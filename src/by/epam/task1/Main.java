package by.epam.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean result;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int number = in.nextInt();
        int[] array = new int[4];
        for (int i = 3; i >= 0; i--) {
            int num = number % 10;
            number = number / 10;
            array[i] = num;
        }
        if (array[0] + array[1] == array[2] + array[3]) {
            result = true;
        } else result = false;
        System.out.println(result);
    }
}

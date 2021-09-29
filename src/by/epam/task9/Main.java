package by.epam.task9;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30, 40};
        int[] array3 = new int[array1.length + array2.length];
        int k = 3;
        int i = 0;
        for (int p = 0; i < array3.length; i++, p++) {
            if (i == k + 1) {
                for (int j = 0; j < array2.length; j++, i++) {
                    array3[i] = array2[j];
                }
            }
            array3[i] = array1[p];
        }

        for (int i1 = 0; i1 < array3.length; i1++) {
            System.out.print(array3[i1] + "  ");
        }

    }
}

package ru.geekbrains.homework.lesson2;

public class HomeWorkTwo {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        checkMinMax();

    }

    public static void invertArray() {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
            System.out.print(arr[i] + " ");

        }
        System.out.println("\n");
    }

    public static void fillArray() {
        int[] arr2 = new int[8];
        int a = 1;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(i + "-" + arr2[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++, a = a + 3) {
            arr2[i] = a;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(i + "-" + arr2[i] + " ");
        }
        System.out.println("\n");
    }

    public static void changeArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + " ");

        }
        System.out.println("\n");
    }

    public static void checkMinMax() {
        int[] arr4 = {3, 6, 12, 7, 8, 11, 4, 7};
        int min = arr4[0], max = arr4[0], indMax = 0, indMin = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max) {
                max = arr4[i];
                indMax = i;
            }
            if (arr4[i] < min) {
                min = arr4[i];
                indMin = i;
            }
        }
        System.out.println("Макc " + indMax + " со значением  = " + max);
        System.out.println("Мин  " + indMin + " со значением  = " + min);

    }
}


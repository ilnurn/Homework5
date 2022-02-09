package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // 1 задача
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        float[] fractional = {1.57f, 7.654f, 9.986f};
        int[] arbitrary = {21, 22, 0 ,2 , 1, 4, 56};

        // 2 задача
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
            if (i == integers.length-1) continue;
            System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < fractional.length; i++) {
            System.out.print(fractional[i]);
            if (i == fractional.length-1) continue;
            System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < arbitrary.length; i++) {
            System.out.print(arbitrary[i]);
            if (i == arbitrary.length-1) continue;
            System.out.print(", ");
        }

        // 3 задача
        System.out.println();
        for (int i = integers.length - 1; i >= 0; i--) {
            System.out.print(integers[i]);
            if (i == 0) continue;
            System.out.print(", ");
        }
        System.out.println();
        for (int i = fractional.length - 1; i >= 0; i--) {
            System.out.print(fractional[i]);
            if (i == 0) continue;
            System.out.print(", ");
        }
        System.out.println();
        for (int i = arbitrary.length - 1; i >= 0; i--) {
            System.out.print(arbitrary[i]);
            if (i == 0) continue;
            System.out.print(", ");
        }

        // 4 задача
        System.out.println();
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                integers[i] = integers[i] + 1;
            }
            System.out.print(integers[i] + " ");
        }





    }
}

package com.company;

public class Main {
    public static void main(String[] args) {
        homework1();
        homework2();
        homework3();
        homework4();
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(100000);
            arr[i] = num + 100000;
        }
        return arr;
    }

    public static void homework1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
            System.out.println("Сумма трат за месяц " + sum + " рублей");
        }
    }

    public static void homework2() {
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей");


        }
    }


    public static void homework3() {
    }


    public static void homework4() {

    }
}





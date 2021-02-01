package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 6, 2, 8};
        Scanner input = new Scanner(System.in);
        System.out.println("enter choice");
        System.out.println("1 For Loop");
        System.out.println("2 For Each");
        System.out.println("3 While");
        System.out.println("4 Do While");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                LoopFor(arr);
                break;
            case 2:
                LoopForEach(arr);
                break;
            case 3:
                LoopWhile(arr);
                break;
            case 4:
                LoopWhileDo(arr);
                break;
        }
    }

    public static void LoopFor(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static void LoopForEach(int[] array) {
        for (int i : array)
            System.out.println(i);
    }

    public static void LoopWhile(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    public static void LoopWhileDo(int[] array) {
        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        }
        while (i < array.length);
    }
}

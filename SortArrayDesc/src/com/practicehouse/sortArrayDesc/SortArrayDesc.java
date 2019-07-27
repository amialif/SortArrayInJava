package com.practicehouse.sortArrayDesc;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDesc {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Let's get the array from our user
        int[] array = getIntegers(5);

        // print our array to see what it contains
        printArray(array);

        // Print the sorted Array in DESC
        sortedArrayDesc(array);
        
        // Print the sorted Array in ASC
        sortedArrayAsc(array);

    }

    // Method 1:  to get Integers for Our Array
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Please Enter " + capacity + " Integer Numbers\r");
        for (int i = 0; i < capacity; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Method 2: to print our array Elements if you Want to See
    public static void printArray(int[] array) {
        System.out.println("The Array Contains ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    // Method to Print Sorted Array in Descending Order
    public static void sortedArrayDesc(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp = 0;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println("Printing Sorted Array in DESC :");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }

    }
    
    // Method to Print Sorted array in Ascending order
    public static void sortedArrayAsc(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp = 0;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println("Printing Sorted Array in ASC :");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }

    }

}

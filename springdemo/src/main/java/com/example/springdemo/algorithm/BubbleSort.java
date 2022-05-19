package com.example.springdemo.algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 9, 8, 7, 4, 5, 6, 1, 233, 25, 99, 98, 45};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void bubbleSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length -1; i++) {
            boolean reSort = true;
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    reSort = false;
                }
            }
            if (reSort) {
                break;
            }
        }
    }
}

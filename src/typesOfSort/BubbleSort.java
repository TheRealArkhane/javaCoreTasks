package typesOfSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 2, 10, 8, 0};
        System.out.println(Arrays.toString(bubbleSortDescending(arr)));
    }

    //Напишите программу, которая сортирует массив целых чисел по возрастанию, используя алгоритм сортировки пузырьком.
    public static int[] bubbleSortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    //Напишите программу, которая сортирует массив целых чисел по убыванию, используя алгоритм сортировки пузырьком.
    public static int[] bubbleSortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1;  j > i; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}

package typesOfSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 2, 10, 8, 0};
        System.out.println(Arrays.toString(selectionSortDesc(arr)));
    }

    //Напишите программу, которая сортирует массив целых чисел по возрастанию, используя алгоритм сортировки выбором.
    public static int[] selectionSortAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    //Напишите программу, которая сортирует массив целых чисел по убыванию, используя алгоритм сортировки выбором.
    public static int[] selectionSortDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}

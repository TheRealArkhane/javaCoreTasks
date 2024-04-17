package typesOfSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 10, 8, 0, 3};
        System.out.println(Arrays.toString(insertionSortAsc(arr)));
    }

    //Напишите программу, которая сортирует массив целых чисел по возрастанию, используя алгоритм сортировки вставками.
    public static int[] insertionSortAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > current) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }
        return arr;
    }
}

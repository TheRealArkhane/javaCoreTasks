package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysTraining {

    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void task1(int[] array) {
        //Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
        //с лямбдами
        System.out.println("max = " + Arrays.stream(array).max().orElseThrow(NegativeArraySizeException::new));
        System.out.println("min = " + Arrays.stream(array).min().orElseThrow(NegativeArraySizeException::new));
        System.out.println("average = " + Arrays.stream(array).average().orElseThrow(NegativeArraySizeException::new));

        //с помощью циклов
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i : array) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
            sum += i;
        }
        double average = (double) sum / array.length;
        System.out.println("max(1) = " + max);
        System.out.println("min(1) = " + min);
        System.out.println("average(1) = " + average);
    }

    public static int[] createFulfilledIntArray(int length, int minRandomBound, int maxRandomBoundExcluded) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(minRandomBound, maxRandomBoundExcluded);
        }
        return array;
    }
}

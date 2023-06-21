package arrays;

import java.util.Arrays;

public class Kata {
    public static double findAverage(int[] array){
        return Arrays.stream(array).average().getAsDouble();
    }
}

package arrays;

import java.util.List;
import java.util.function.ToIntFunction;

//Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

public class MixedSum {

    public static int sum(List<?> mixed) {
        return mixed
                .stream()
                .mapToInt((ToIntFunction<Object>) x -> x instanceof String
                        ? Integer.parseInt((String) x) : (int) x).sum();
    }
}

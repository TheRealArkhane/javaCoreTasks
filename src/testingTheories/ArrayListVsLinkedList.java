package testingTheories;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
        public static void main(String[] args) {
            linkedListExecutionTime(5_000_000, 2_000_000, 100);
            arrayListExecutionTime(5_000_000, 2_000_000, 100);
        }

        public static void linkedListExecutionTime(int size, int index, int numberOfElementsToAdd) {
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                list.add(i);
            }
            long start = System.currentTimeMillis();
            for(int i = 0; i < numberOfElementsToAdd; i++) {
                list.add(index, Integer.MAX_VALUE);
            }
            System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis() - start));
        }

        public static void arrayListExecutionTime (int size, int index, int numberOfElementsToAdd) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(i);
            }
            long start = System.currentTimeMillis();
            for (int i = 0; i < numberOfElementsToAdd; i++) {
                list.add(index, Integer.MAX_VALUE);
            }
            System.out.println("Время работы для ArrayList (в миллисекундах) = " + (System.currentTimeMillis() - start));
        }
}



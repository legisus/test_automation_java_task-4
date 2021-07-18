package com.epam.test.automation.java.practice4;

import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class Task2 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int[] transform(int[] array, SortOrder order) {
        if (Task1.isSorted(array, SortOrder.ASC)) {
            for (int i = 0; i < array.length; i++) {
                array[i] = i+array[i];
            }
        }
        return array;
    }
}

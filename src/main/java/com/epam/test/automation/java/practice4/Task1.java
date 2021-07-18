package com.epam.test.automation.java.practice4;

import java.util.stream.IntStream;

public class Task1 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array.length < 1 && array.toString() == null){
            throw new IllegalArgumentException();
        }

        if (order == SortOrder.ASC){
            boolean isAscending = false;
            if (IntStream.range(0, array.length - 1).noneMatch(i -> array[i] > array[i + 1])){
                isAscending = true;
                order = SortOrder.ASC;
            }else if (IntStream.range(0, array.length - 1).noneMatch(i -> array[i] < array[i + 1])){
                isAscending = false;
                order = SortOrder.DESC;
            }
            return isAscending;
        }
        if (order == SortOrder.DESC){
            boolean isDesc = false;
            if (IntStream.range(0, array.length - 1).noneMatch(i -> array[i] < array[i + 1])){
                isDesc = true;
                order = SortOrder.ASC;
            }else if (IntStream.range(0, array.length - 1).noneMatch(i -> array[i] > array[i + 1])){
                isDesc = false;
                order = SortOrder.DESC;
            }
            return isDesc;
        }
        return false;
    }
}

package com.epam.test.automation.java.practice4;

import java.util.Arrays;
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
        if (array.length < 1 && Arrays.toString(array) == null){
            throw new IllegalArgumentException();
        }

        if (order == SortOrder.ASC){
            boolean isAscending = false;
            if (IntStream.range(0, array.length - 1).noneMatch(i -> array[i] > array[i + 1])){
                isAscending = true;
            }else if (IntStream.range(0, array.length - 1).noneMatch(i -> array[i] < array[i + 1])){
                isAscending = false;
            }
            return isAscending;
        }if (order == SortOrder.DESC){
            boolean isDesc = false;
            if (IntStream.range(0, array.length - 1).noneMatch(i -> array[i] < array[i + 1])){
                isDesc = true;
            }else if (IntStream.range(0, array.length - 1).noneMatch(i -> array[i] > array[i + 1])){
                isDesc = false;
            }
            return isDesc;
        }
        return false;
    }

/*
TeacherSuite > TeacherTests > com.epam.test.automation.java.practice4.TestsTeacherTask1 > testArrayIsSortedWithNullArgs FAILED

    org.testng.TestException:

    Expected exception of type class java.lang.IllegalArgumentException but got java.lang.NullPointerException



        Caused by:

        java.lang.NullPointerException
 */

    /*
    TeacherSuite > TeacherTests > com.epam.test.automation.java.practice4.TestsTeacherTask1 > arrayIsSortedWithIllegalArgumentException[0]([I@75b9adfd) FAILED

    org.testng.TestException:

    Method TestsTeacherTask1.arrayIsSortedWithIllegalArgumentException([I)[pri:0, instance:com.epam.test.automation.java.practice4.TestsTeacherTask1@3d554406] should have thrown an exception of type class java.lang.IllegalArgumentException
     */
}

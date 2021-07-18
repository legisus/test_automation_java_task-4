package com.epam.test.automation.java.practice4;

public class Task3 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        int[] nums = new int[n];
        nums[0] = a1;
        int result = a1;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1]+t;
            result = result * nums[i];
        }
        return result;
    }
}

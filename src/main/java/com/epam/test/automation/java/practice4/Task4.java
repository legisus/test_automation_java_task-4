package com.epam.test.automation.java.practice4;

public class Task4 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static double sumGeometricElements(int a1, double t, int alim) {

        if (alim < 0) {
            throw new IllegalArgumentException();
        } else {
            int c = 30;
            double[] nums = new double[c];
            nums[0] = a1;
            double result = a1;

            for (int i = 1; alim < (int) (nums[i - 1] * t); i++) {
                c++;
                nums[i] = nums[i - 1] * t;
                result = result + nums[i];
            }
            return result;
        }
    }
}

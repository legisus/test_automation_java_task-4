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
        int c = 30;
        double[] nums = new double[c];
        double[] last = new double[c];
        nums[0] = a1;
        double result = a1;
        int aClone = a1;

            for (int i = 1; i < nums.length; i++) {
                c++;
                if (alim < aClone) {
                nums[i] = (int) (nums[i - 1] * t);
                if (alim < (int) (nums[i - 1] * t)){
                    last[i] = (int) (nums[i - 1] * t);
                }
            }
                result = result + last[i];
                aClone = (int) nums[i];
        }
        return result;
    }
}

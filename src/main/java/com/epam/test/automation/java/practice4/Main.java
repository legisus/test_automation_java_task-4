package com.epam.test.automation.java.practice4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] sortedAsc = { 1, 2, 3, 4, 5 };
        int[] sortedDesc = { 5, 4, 2, 1 };
        int[] arrayNull = {};

        System.out.println(Task1.isSorted(sortedAsc,SortOrder.ASC));
        System.out.println(Task1.isSorted(sortedAsc,SortOrder.DESC));
        System.out.println();
        System.out.println(Task1.isSorted(sortedDesc,SortOrder.ASC));
        System.out.println(Task1.isSorted(sortedDesc,SortOrder.DESC));
        System.out.println();
        System.out.println(Task1.isSorted(arrayNull,SortOrder.DESC));
        System.out.println(Task1.isSorted(arrayNull,SortOrder.DESC));
        System.out.println();
        System.out.println(Arrays.toString(Task2.transform(sortedAsc, SortOrder.ASC)));

    }
}
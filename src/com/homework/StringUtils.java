package com.homework;

import java.util.Arrays;

public class StringUtils {
    private StringUtils() {

    }

    public static String toUpperCaseFirstLetter(String a) {
        return a.substring(0, 1).toUpperCase() + a.substring(1);
    }

    public static boolean isAnagram(String a, String b) {
        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();

        SortAlgorithms.insertionSort(aChars);
        SortAlgorithms.insertionSort(bChars);

        return ArrUtils.isEquals(aChars, bChars);
    }

}

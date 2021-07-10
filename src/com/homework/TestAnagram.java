package com.homework;

import java.util.Arrays;

public class TestAnagram {


    public static void main(String[] args) {

        System.out.println(anagram("hello", "ehlLo"));
        System.out.println(anagram("hello", "ehlLoo"));
    }

    public static boolean anagram(String a, String b) {
        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);

        return Arrays.equals(aChars, bChars);
    }
}

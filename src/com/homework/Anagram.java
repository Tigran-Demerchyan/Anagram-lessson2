package com.homework;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("JAVA", "ajva"));
        System.out.println(isAnagram("JAVA", "pithon"));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.equals(s2)) {
            return true;
        }
        for (int i = 0; i < s1.length(); i++) {
            s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
        }
        if (s2.equals("")) {
            return true;
        }
        return false;
    }
}


package com.homework;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a.length() + b.length());
        int i = a.compareTo(b);
        if (i > 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(toUpperCaseFirstLetter(a) + " " + toUpperCaseFirstLetter(b));
    }

    private static String toUpperCaseFirstLetter(String a) {
        String cap = a.substring(0, 1).toUpperCase() + a.substring(1);
        return cap;
    }
}

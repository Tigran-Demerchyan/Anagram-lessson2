package com.homework;

import com.homework.util.StringUtils;

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
        System.out.println(StringUtils.toUpperCaseFirstLetter(a) + " " + StringUtils.toUpperCaseFirstLetter(b));

        System.out.println("-------------------------");

        System.out.println(StringUtils.isAnagram("hello", "ehlLo"));
        System.out.println(StringUtils.isAnagram("hello", "ehlLoo"));
    }


}

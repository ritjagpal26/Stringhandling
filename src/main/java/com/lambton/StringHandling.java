package com.lambton;

import sun.security.util.Length;

public class StringHandling {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = new String("Hello");

        if (s1 == s2) {
            System.out.println("s1==s2");
        } else {
            System.out.println("s1!=s2");
        }
        if (s2 == s3) {
            System.out.println("s3==s2");
        } else {
            System.out.println("s3 !=s2");
        }
        if (s1 == s4) {
            System.out.println("s1==s4");
        } else {
            System.out.println("s1!=s4");


            System.out.println(s1);

            s1.toLowerCase();
            System.out.println(s1);

            s1.toUpperCase();
            System.out.println(s1);

            System.out.println(s1.toLowerCase());


            String collegName = "Lambton College in Toronto";
            // find the length

            System.out.println( collegName.length());

            //find the word college

            System.out.println( collegName.subSequence(8,16));
            System.out.println( collegName.indexOf("Toronto"));
            System.out.println( collegName.toUpperCase());
            System.out.println( collegName.toLowerCase());
            System.out.println( collegName.charAt(10));
            System.out.println( collegName.replace("Toronto", "New York"));
            System.out.println( collegName.substring(11,26));
            System.out.println( collegName.toCharArray());
            System.out.println( collegName.concat(" 265 Yorkland Blvd, New York"));

            int a[] = { 1,2,3,4,5};
            int b[] = new int[]{6,7,8,9,0};
            int c[]=new int[10];









        }
    }
}
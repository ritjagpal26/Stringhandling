package com.lambton;

import javafx.scene.input.DataFormat;
import sun.awt.geom.AreaOp;
import sun.security.util.Length;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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

            System.out.println(collegName.length());

            //find the word college

            System.out.println(collegName.subSequence(8, 16));
            System.out.println(collegName.indexOf("Toronto"));
            System.out.println(collegName.toUpperCase());
            System.out.println(collegName.toLowerCase());
            System.out.println(collegName.charAt(10));
            System.out.println(collegName.replace("Toronto", "New York"));
            System.out.println(collegName.substring(11, 26));
            System.out.println(collegName.toCharArray());
            System.out.println(collegName.concat(" 265 Yorkland Blvd, New York"));

            int a[] = {1, 2, 3, 4, 5};
            int b[] = new int[]{6, 7, 8, 9, 0};
            int c[] = new int[10];
            String s= String.format("%d %s %s", 10 ,"Hello" , "world");

            Scanner scanner=new Scanner(System.in);
            System.out.printf("Enter college name :");
            String pattern="###,##,##,00" ;
            DecimalFormat decimalFormat=new DecimalFormat();
            decimalFormat.applyPattern(pattern);

            int value=12345678;
            String output= decimalFormat.format(value);
        System.out.printf(value+" "+pattern+" "+output);
            char cc[]=collegName.toCharArray();
            char rev[]= new char[c.length];
            int cnt=0;

          /*for(int i=cc.length-1; i>=0 ;i--)k
            {
              //char aa= (char) c[i];
              rev[cnt++] = cc[i];
               //System.out.println(cc[1]);
            }
            String reversestering =new String(rev);
            System.out.println("reverese String : " +reversestering);*/

            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            Date dateobj = new Date();
            System.out.println(df.format(dateobj));

        }
    }
}
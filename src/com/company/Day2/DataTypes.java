package com.company.Day2;

import java.util.*;
public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine(); // read the rest of the line of input (newline character after the double token).
        s2 = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + d2);

        /* Concatenate and print the String variables on a new line integer variables on a new line;
           the 'string` variable above should be printed first. */
        System.out.println(s + s2);

        scan.close();
    }
}


/*
For this explanation, the variables provided in your editor are subscripted with a , and the corresponding variables
declared and initialized by you are subscripted with .

The following variables are already declared and initialized in your editor:
, , and .
In the first test case, the following variables were read from stdin:
, , and .
Our first line of output is the result of .
Our second line of output is the result of .
Our third line of output is the result of .
* */
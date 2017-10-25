package com.company.Day1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
        String inputString = scan.nextLine(); // read a line of input and save it to a variable
        scan.close(); // close the scanner

        // Your first line of output goes here
        System.out.println("Hello, World.");

        System.out.println(inputString);
    }
}


/*
The purpose of this challenge is to familiarize you with the syntax for reading input from stdin and printing output
to stdout.The first line of output (i.e., the one printing the string literal Hello, World!) is provided for you. To
pass this challenge, you must do the following:
1) Copy the given code's output syntax (e.g., System.out.println("Hello, World!")) and paste it below
the second comment (i.e., the "Write your code here..." comment).
2) Replace the "Hello, World!" string literal in your copied line of code with inputString. This will ensure
that when the code is run against the second test case, the value printed will change and appropriately
match the value expected by the test case.
* */
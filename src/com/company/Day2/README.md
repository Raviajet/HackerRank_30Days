#Problem

###Objective
Today, we're discussing data types. Check out the Tutorial tab for learning materials and an instructional video!

###Task
Complete the code in the editor below. The variables , , and  are already declared and initialized for you. You must:

Declare  variables: one of type int, one of type double, and one of type String.
Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
Use the  operator to perform the following operations: 
Print the sum of  plus your int variable on a new line.
Print the sum of  plus your double variable to a scale of one decimal place on a new line.
Concatenate  with the string you read as input and print the result on a new line.
Note: If you are using a language that doesn't support using  for string concatenation (e.g.: C), you can just print one variable immediately following the other on the same line. The string provided in your editor must be printed first, immediately followed by the string you read as input.

###Input Format

The first line contains an integer that you must sum with . 
The second line contains a double that you must sum with . 
The third line contains a string that you must concatenate with .

###Output Format

Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.

###Sample Input

12
4.0
is the best place to learn and practice coding!
###Sample Output

16
8.0
HackerRank is the best place to learn and practice coding!
Explanation

When we sum the integers  and , we get the integer . 
When we sum the floating-point numbers  and , we get . 
When we concatenate HackerRank with is the best place to learn and practice coding!, we get HackerRank is the best place to learn and practice coding!.

You will not pass this challenge if you attempt to assign the Sample Case values to your variables instead of following the instructions above and reading input from stdin.


#Tutorial

###Data Types
Data types define and restrict what type values can be stored in a variable, as well as set the rules for what types of operations can be performed on it. 
###Primitive Data Types
Java has 8 primitive data types: byte, short, int, long, float, double, boolean, and char. For most challenges, you'll only need to concern yourselves with ints (e.g.: , , , etc.) and doubles (e.g.: , , , etc.). Another important data type we mentioned yesterday is the String class, whose objects are immutable strings of characters. 
###Scanner
Yesterday, we discussed Scanner's next, nextLine, hasNext, and hasNextLine methods. Scanner also has readNext and hasNext methods for different data types, which is very helpful when you know exactly what type of input you'll be reading. The next methods scan for tokens (you can think of this as a word), and the nextLine methods reads from the Scanner's current location until the beginning of the next line. For example, nextInt() will scan the next token of input as an int, and nextDouble() will scan the next token of input as a double. You should only ever use  scanner object for your entire program. 
Each line of multi-line input contains an invisible separator indicating that the end of a line of input has been reached. When you use Scanner functions that read tokens (e.g.: next(), nextInt(), etc.), the Scanner reads and returns the next token. When you read an entire line (i.e.: readLine()), it reads from the current position until the beginning of the next line. Because of this, a call to nextLine() may return an empty string if there are no characters between the end of the last read and the beginning of the next line. For example, given the following input:
a b c
d e
f
g
The breakdown below shows how a certain sequence of calls to a Scanner object, , will read the above input:
A call to scan.next(); returns the next token, a.
A call to scan.next(); returns the next token, b.
A call to scan.nextLine(); returns the next token, c. It's important to note that the scanner returns a space and a letter, because it's reading from the end of the last token until the beginning of the next line.
A call to scan.nextLine(); returns the contents of the next line, d e.
A call to scan.next(); returns the next token, f.
A call to scan.nextLine(); returns everything after f until the beginning of the next line; because there are no characters there, it returns an empty String.
A call to scan.nextLine(); returns g.
Note: You will struggle with this challenge if you did not review this section. You must understand what happens when you switch between reading a token (single word) of input and reading an entire line of input to successfully complete this challenge.
###Additive Operator
The + operator is used for mathematical addition and String concatenation (i.e.: combining two Strings into one new String). If you add the contents of two variables together (e.g.: a + b), you can assign their result to another variable using the assignment operator (=). You can also pass the result to a function instead of assigning it to a variable; for example, if  and , System.out.println(a + b); will print 3 on a new line.  
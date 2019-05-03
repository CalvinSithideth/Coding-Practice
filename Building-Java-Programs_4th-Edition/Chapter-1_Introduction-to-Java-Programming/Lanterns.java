/*
BJP4 Exercise 1.14: Lanterns
Assignment: 
Write a complete Java program in a class named Lanterns that generates the following three figures of output.
Use static methods to show structure and eliminate redundancy in your solution.

In particular, make sure that main contains no System.out.println statements except for blank lines,
that any System.out.println statement(s) repeated are captured in a method that is called just once,
and that the same System.out.println statement never appears in two places in the code.


    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****


*/

public class Lanterns {

    public static void main( String[] args ) {
        printStarPyramid();
        printNewLine();
        printStarPyramid();
        printLanternGlass();
        printStarLine();
        printStarPyramid();
        printNewLine();
        printStarPyramid();
        printStarLineShort();
        printLanternGlass();
        printLanternGlass();
        printStarLineShort();
        printStarLineShort();
    }

    public static void printLanternGlass() {
        System.out.println("* | | | | | *");
    }

    public static void printStarLine() {
        System.out.println("*************");
    }

    public static void printStarLineShort() {
        System.out.println("    *****");
    }

    public static void printStarPyramid() {
        printStarLineShort();
        System.out.println("  *********");
        printStarLine();
    }
    
    public static void printNewLine() {
        System.out.println();
    }

}
    
/*
BJP4 Exercise 1.13: StarFigures
Assignment: 
Write a complete Java program in a class named StarFigures that generates the following output.
Use static methods to show structure and eliminate redundancy in your solution.


*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *


*/

public class StarFigures {

    public static void main( String[] args ) {
        printStarEqualSign();
        printStarX();
        System.out.println();
        printStarEqualSign();
        printStarX();
        printStarEqualSign();
        System.out.println();
        printStarVerticalSign();
        printStarEqualSign();
        printStarX();
    }

    public static void printStarEqualSign() {
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void printStarX() {
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }

    public static void printStarVerticalSign() {
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
    
}

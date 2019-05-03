/*
BJP4 Exercise 1.16: Shining
Assignment: 
Write a program in a class named Shining that prints the following line of output 1000 times:


All work and no play makes Jack a dull boy.


You should not write a program whose source code is 1000 lines long;
use methods to shorten the program.
What is the shortest program you can write that will produce the 1000 lines of output,
using only the material from Chapter 1 (println, methods, etc.)?


*/

public class Shining {

    public static void main( String[] args ) {
        printJackTwoHundredFifty();
        printJackTwoHundredFifty();
        printJackTwoHundredFifty();
        printJackTwoHundredFifty();
    }

    public static void printJack() {
        System.out.println("All work and no play makes Jack a dull boy.");
    }

    public static void printJackFive() {
        printJack();
        printJack();
        printJack();
        printJack();
        printJack();
    }

    public static void printJackTwentyFive() {
        printJackFive();
        printJackFive();
        printJackFive();
        printJackFive();
        printJackFive();
    }

    public static void printJackTwoHundredFifty() {
        printJackTwentyFive();
        printJackTwentyFive();
        printJackTwentyFive();
        printJackTwentyFive();
        printJackTwentyFive();
        printJackTwentyFive();
        printJackTwentyFive();
        printJackTwentyFive();
        printJackTwentyFive();
        printJackTwentyFive();
    }

}

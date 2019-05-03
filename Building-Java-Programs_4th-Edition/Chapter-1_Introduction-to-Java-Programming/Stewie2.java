/*
BJP4 Exercise 1.8: Stewie2
Assignment: 
Write a complete Java program in a class named Stewie2 that prints the following output.
Use at least one static method besides main to remove redundancy.


//////////////////////
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\

*/

public class Stewie2 {

    public static void main( String[] args ) {
        printForwardSlashes();
        printVictoryIsMine();
        printBackSlashes();
        printVictoryIsMine();
        printBackSlashes();
        printVictoryIsMine();
        printBackSlashes();
        printVictoryIsMine();
        printBackSlashes();
        printVictoryIsMine();
        printBackSlashes();
    }

    public static void printForwardSlashes() {
        System.out.println("//////////////////////");
    }

    public static void printVictoryIsMine() {
        System.out.println("|| Victory is mine! ||");
    }

    public static void printBackSlashes() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}

/*
BJP4 Exercise 1.10: Egg2
Assignment: 
Write a complete Java program in a class named Egg2 that generates the following output.
Use static methods to show structure and eliminate redundancy in your solution.


  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
\         /
 \_______/
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/


*/

public class Egg2 {

    public static void main( String[] args ) {
        printTopEgg();
        printBottomEgg();
        printCrack();
        printTopEgg();
        printBottomEgg();
        printCrack();
        printBottomEgg();
        printTopEgg();
        printCrack();
        printBottomEgg();
    }

    public static void printTopEgg() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void printBottomEgg() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }

    public static void printCrack() {
        System.out.println("-\"-'-\"-'-\"-");
    }

}

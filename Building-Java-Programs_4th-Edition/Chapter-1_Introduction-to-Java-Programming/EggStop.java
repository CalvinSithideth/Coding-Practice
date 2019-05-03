/*
BJP4 Exercise 1.15: EggStop
Assignment: 
Write a complete Java program in a class named EggStop that generates the following output.
Use static methods to show structure and eliminate redundancy in your solution.


  ______
 /      \
/        \
\        /
 \______/

  ______
 /      \
/        \
\        /
 \______/
+--------+

  ______
 /      \
/        \
|  STOP  |
\        /
 \______/
+--------+


*/

public class EggStop {

    public static void main( String[] args ) {
        printTopEgg();
        printBottomEgg();
        printNewLine();
        printTopEgg();
        printBottomEgg();
        printSegment();
        printNewLine();
        printTopEgg();
        printStop();
        printBottomEgg();
        printSegment();
    }

    public static void printStop() {
        System.out.println("|  STOP  |");
    }

    public static void printSegment() {
        System.out.println("+--------+");
    }

    public static void printTopEgg() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void printBottomEgg() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }

    public static void printNewLine() {
        System.out.println();
    }

}

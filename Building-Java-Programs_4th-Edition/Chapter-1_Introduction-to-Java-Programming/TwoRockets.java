/*
BJP4 Exercise 1.11: TwoRockets
Assignment: 
Write a complete Java program in a class named TwoRockets that generates the following output.
Use static methods to show structure and eliminate redundancy in your solution.

Note that there are two rocket ships next to each other.
What redundancy can you eliminate using static methods?
What redundancy cannot be eliminated?


   /\       /\
  /  \     /  \
 /    \   /    \
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
|United| |United|
|States| |States|
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
   /\       /\
  /  \     /  \
 /    \   /    \


*/

public class TwoRockets {
        public static void main( String[] args ) {
            rocketTriangles();
            rocketSegment();
            rocketStraight();
            rocketSegment();
            rocketUSA();
            rocketSegment();
            rocketStraight();
            rocketSegment();
            rocketTriangles();
        }
        
        // prints the triangles for the tops and bottoms of the rockets
        public static void rocketTriangles() {
            System.out.println("   /\\       /\\");
            System.out.println("  /  \\     /  \\");
            System.out.println(" /    \\   /    \\");
        }
        
        // prints the horizontal segments of the rockets 
        public static void rocketSegment() {
            System.out.println("+------+ +------+");
        }
        
        // prints the straight vertical walls of the rockets
        public static void rocketStraight() {
            System.out.println("|      | |      |");
            System.out.println("|      | |      |");
        }
        
        // prints "United States" within the rockets' walls
        public static void rocketUSA() {
            System.out.println("|United| |United|");
            System.out.println("|States| |States|");
        }
    }

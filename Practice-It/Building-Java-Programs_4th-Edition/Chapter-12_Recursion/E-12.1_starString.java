/*
BJP4 Exercise 12.1: starString
Assignment: 

Write a method starString that accepts an integer parameter n and
returns a string of stars (asterisks) 2n long (i.e., 2 to the nth power).

For example:
Call            Output              Reason
starString(0);	"*"                 2^0 = 1
starString(1);	"**"                2^1 = 2
starString(2);	"****"              2^2 = 4
starString(3);	"********"          2^3 = 8
starString(4);	"****************"	2^4 = 16

You should throw an IllegalArgumentException if passed a value less than 0.


 */

public String starString(int n) {
	
    if ( n < 0 ) {
        throw new IllegalArgumentException();
    }
    
    // Base Case
    if (n == 0 ) {
        return "*";
    }
    
    
    // Recursive Case
    return starString(n - 1) + starString(n - 1);
    
}
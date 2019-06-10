/*
BJP4 Exercise 10.6: minToFront
Assignment: 

Write a method minToFront that takes an ArrayList of integers as a parameter and
that moves the minimum value in the list to the front,
otherwise preserving the order of the elements.


For example, if a variable called list stores the following values:
{3, 8, 92, 4, 2, 17, 9}

and you make this call: minToFront(list);

it should store the following values after the call:
{2, 3, 8, 92, 4, 17, 9}


You may assume that the list stores at least one value.

*/


public void minToFront(ArrayList<Integer> list) {
	
    int minVal = list.get(0);
    
    // Loop through the list to find the minValue
    for ( int i = 0; i < list.size(); i++ ) {
        if ( list.get(i) < minVal) {
            minVal = list.get(i);
        }
    }
    
    // Remove minValue, then add it to the beginning of the list
    list.add( 0, list.remove( list.indexOf(minVal) ) );
    
}
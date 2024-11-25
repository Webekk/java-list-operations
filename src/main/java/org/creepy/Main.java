//LEARNING MATERIALS

//https://www.geeksforgeeks.org/list-interface-java-examples/
//https://www.digitalocean.com/community/tutorials/java-list
//https://www.javatpoint.com/java-list

package org.creepy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //LISTS

        //Creating a List of elements
        // Lists are indexed just like arrays so the first element will be number 0

        List<Integer> numbers = new ArrayList<>();

        //adding elements to a list

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        //Displaying the list

        System.out.println("List: " + numbers);

        //Adding the element in to concrete spot

        numbers.add(1,15); // add 15 on position 1
        System.out.println("After adding 15 to position 1 " + numbers);

        //Removing elements

        numbers.remove(2);// remove element number 2
        System.out.println("After removing element at position 2 " + numbers);

        // getting the element of the list

        int numberAtIndex1 = numbers.get(1);
        System.out.println("Element on position 1: " + numberAtIndex1);

        // Check the size of the list
        System.out.println("List size: " + numbers.size());

        // Checks if the element is in the list with contains() method
        if (numbers.contains(20)){
            System.out.println("This element is in the list");
        }else {
            System.out.println("This element is not in the list");
        }

        // iteration over the list with for each loop
        for(int num : numbers){
            System.out.println(num);
        }

        // Sorting the list in the descending order
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println("Sorted list in descending order " + numbers);
    }
}
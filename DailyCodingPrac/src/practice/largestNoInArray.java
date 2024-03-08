//Write a code to find the largest number in an array
package practice;
import java.util.*;

public class largestNoInArray {

    public static void main(String[] args) {
        int[] array = {1, 6, 9, 3, 6}; // Array declaration and initialization
        int largest = array[0]; // Initialize the largest variable with the first element of the array

        for(int i = 1; i < array.length; i++) { // Loop through the array starting from the second element
            if(largest < array[i]) { // Compare the current element with the largest variable
                largest = array[i]; // Update largest if the current element is greater
            }
        }

        System.out.println("The largest number in the array is: " + largest); // Print the largest number
    }

}

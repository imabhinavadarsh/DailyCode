//Write a code to print the smallest number of Array.
package practice;
import java.util.*;

public class smallestNumberInArray {

	public static void main(String[] args) {
		// Array declaration and initialization
		int[] array = {8, 7, 9, 8, 4, 6, 1};
		
		// Initialize the min variable with the first element of the array
		int min = array[0];
		
		// Loop through the array starting from index 0
		for(int i = 0; i <= array.length - 1; i++) {
			// Compare the current element with min
			if(min > array[i]) {
				// Update min if the current element is smaller
				min = array[i];
			}
		}
		
		// Print the smallest number
		System.out.println(min);
	}

}

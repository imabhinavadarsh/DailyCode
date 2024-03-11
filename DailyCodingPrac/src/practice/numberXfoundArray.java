//Take an array as input from user search for a given number X and print the index at which it occurs.
package practice;
import java.util.*;
public class numberXfoundArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];//initialize the size of array and creation of array with length 
		for(int i = 0; i <= arr.length -1; i++) {
			arr[i] = sc.nextInt();//take array elements
		}
		System.out.println("Enter the number X you want to find: ");
		int x = sc.nextInt();
		for(int i = 0; i<= arr.length - 1; i++) {//This loop is used to travers in array
			if(arr[i] == x) {
				System.out.println("X found at this index: "  + i );
			}
		}
		
	}

}

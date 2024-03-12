//Bubble sorting techniques 
package practice;
import java.util.*;
public class bubbleSort {
	public static void printArray(int arr[]) {//created function for printArray
		for(int i = 0; i < arr.length; i++) {//sorted array 
			System.out.print(arr[i] + " " );//print on console 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,7,3,5,1,9};
		//bubble sort
		for(int i = 0; i < arr.length -1; i++) {//outer loop 
			for(int j = 0; j < arr.length - i - 1; j++) {//inner loop
				if(arr[j] > arr[j + 1]) {//comparing element with adjacent element 
					//swapping
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArray(arr);//calling function

	}

}

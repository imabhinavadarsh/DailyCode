package practice;

import java.util.*;

public class bubbleSortFromUser {
	
	public static void printArray(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		
		int size = sc.nextInt();//taking array size from user 
		
		int [] arr = new int[size];//initializing the size  of array
		
		System.out.println("Enter the elements of the array: ");

		for(int i = 0; i <= arr.length -1; i++ ) {
			arr[i] = sc.nextInt();	
			System.out.println(arr[i] + "");

		}
		//Bubble sort
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++ ) {
				if(arr[j] > arr[j+1]) {
					//swap
					 int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
				}
				
			}
		}
		System.out.println("Sorted Array");
		printArray(arr);
		sc.close();
	}

}

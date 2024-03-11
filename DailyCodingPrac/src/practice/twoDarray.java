//Take Input of 2 D array and print it in the form of matrix
package practice;
import java.util.*;
public class twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();//input from user for rows
		int cols = sc.nextInt();//input from user for cols
		int[][] arr = new int[rows][cols];//creation of 2 d array
		for(int i = 0; i<rows;i++) {//input for loop
			for(int j = 0;j < cols; j ++) {
				arr[i][j] = sc.nextInt();//initializing elements of 2 d array
			}
		}
		for(int i = 0; i < rows; i++) {//output for loop
			for(int j = 0; j< cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

//Take a matrix as input from user. Search for a given number X and print the indices at which it occurs
package practice;
import java.util.*;
public class twoDarrayXfoundIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j< cols; j++) {
				arr[i][j] = sc.nextInt();
			}
			}
		int X = sc.nextInt();
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if (arr[i][j] == X){
					System.out.println("X found at indices: "+"(" + i +"," + j + ")");
				}
			}
		}
	}

}

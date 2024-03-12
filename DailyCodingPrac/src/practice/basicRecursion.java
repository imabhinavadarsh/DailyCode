//Print numbers from 5 to 1
package practice;
import java.util.*;
public class basicRecursion {
	public static void printNumbers(int n) {
		if(n == 0) {//This is the base case
			return;
		}
		System.out.println(n);
		printNumbers(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printNumbers(n);//n = 5

	}

}

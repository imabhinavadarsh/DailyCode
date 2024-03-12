//print a number from 1 to 5
package practice;
import java.util.*;
public class basicRecursionAscending {
	public static void printNumber(int n) {
		if(n == 6) {
			return;
		}
		System.out.println(n);
		printNumber(n+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 1;
		printNumber(n);

	}

}

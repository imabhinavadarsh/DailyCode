/*
 * With the help of for loop print the table of any number 
 * APPROACH : I tried to create to variable of data type int 
 * In one variable I will take input from user 
 * In second variable I will store the value of user input variable * by i;
 * then I will print it.
 * variable which are inside the loop are known as local variable or temp variable it cant be accessed outside the loop.
 */
package practice;
import java.util.*;
public class forLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want table of: ");
		int n = sc.nextInt();
		int b;
		for(int i = 1; i<=10; i++) {
			b = n * i;
			System.out.println(b);
			sc.next();
		}
		
	}

}

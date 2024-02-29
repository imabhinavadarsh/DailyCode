//W A P FOR ADDING two BINARY 
package practice;
import java.util.*;
public class BinarySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Binary: ");
		String b1 = sc.next();
		System.out.println("Enter the Second Binary: ");
		String b2 = sc.next();
		// NOW i need to convert this binary to int to sum it. I will use Integer.parseInt base 2
		
		int a = Integer.parseInt(b1, 2);
		int c = Integer.parseInt(b2, 2);
		int d = a + c;
		//Converting to integer and sum is done now I'll display this to console
		System.out.println("Sum of  " + b1 +" and "+ b2 +" is : " + d);

	}

}

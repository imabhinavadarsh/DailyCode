//W A P to add two octal
package practice;
import java.util.*;
public class OctalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Octal: ");
		String o1 = sc.next();
		System.out.print("Enter the second Octal: ");
		String o2 = sc.next();
		
		int x = Integer.parseInt(o1, 8);
		int y = Integer.parseInt(o2, 8);
		int z = x + y;
		System.out.println(z);
		

	}

}

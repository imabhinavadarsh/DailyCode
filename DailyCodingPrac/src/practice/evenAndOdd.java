package practice;
import java.util.*;
public class evenAndOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check even or odd : ");
		int n = sc.nextInt();
		if(n % 2 == 0) {
			System.out.println("The number : "+"" + n +" " + "is Even");
		}
		else {
			System.out.println("The number : "+"" + n +" " + "is odd");
		}

	}

}

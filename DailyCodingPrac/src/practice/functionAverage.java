// Enter 3 numbers from the user & make a function to print their average.
package practice;
import java.util.*;
public class functionAverage {
	public static int threeNumberAverage(int a, int b, int c) {
		return (a+b+c) / 3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int average = threeNumberAverage(a, b, c);
		System.out.println(average);

	}

}

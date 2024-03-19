package practice;
import java.util.*;
public class TryCatchSum {
	public void calcSumArray() {
		try(Scanner sc = new Scanner(System.in)){
			int size = sc.nextInt();
			
			if(size <= 0) {
				System.out.println("Size should not be zero or negative number");
				return;
			}
			
			int[] a = new int[size];
			for(int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			
			System.out.println(Arrays.stream(a).sum());
			
		}catch(InputMismatchException e) {
			System.out.println("The input should be integer");
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		TryCatchSum tcs = new TryCatchSum();
		tcs.calcSumArray();
	}

}

package practice;
import java.util.*;
public class checkPalindrome {

	public static void main(String[] args) {
/*Here is what my logic is 		
 * I will first take input from user and stored it in the form of String
 * Then I will reverse the string by running for loop (decrement) "i-- " and stored in another string
 * Then I will compare the both string. If it match "isPalindrome" if it does not match "isNotPalindrome"
 * After reversing 
*/
		Scanner sc = new Scanner(System.in);
		String revs = "";
		System.out.println("PALINDROME CHECKER");
		System.out.println("Enter your number:");
		String s = sc.next();
		for(int i = s.length() - 1; i >= 0; i--) {
			revs  = revs + s.charAt(i);
		}
		//to check whether this is palindrome or not I will use ternary operator
		String palindromeChecker = (s.equals(revs))?"isPalindrome":"notPalindrome";
		System.out.println(palindromeChecker);
	}

}

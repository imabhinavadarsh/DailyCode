//write a program to reverse a string 
package practice;
import java.util.*;
public class stringBuilderReverseFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Abhinav123456789");
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
	}
}

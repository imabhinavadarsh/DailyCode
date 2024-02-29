/*Write a program "USE TERNARY OPERATOR ?
 *CONDITIONS
 *1 IF A STUDENT GET 90 OR ABOVE MARKS GRADE = A.
 *2 IF A STUDENT SCORED LESS THAN 90 GRADE = B.
 *TAKE INPUT FROM USER AS MARKS
 */
package practice;
import java.util.*;
public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int marks = sc.nextInt();
		String grade = (marks >= 90)?"A":"B";
		System.out.println(grade);

	}

}

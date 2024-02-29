/*Question What is the difference between == operator and .equal operator ? Explain this with an example?
 * In general we use == operator for (reference comp. and address comp.) but if I talk about .equal() 
 * it does not matter if the address of object is different but the content inside should be same.
*/
package practice;
import java.util.*;
public class DiffDoubleEqualOPTandDotEqual {

	public static void main(String[] args) {
		String s1 = new String("Abhi");
		String s2 = new String("Abhi");
		System.out.println(s1 == s2);//here checking for address comp.
		System.out.println(s1.equals(s2));//here checking for content.
	}

}

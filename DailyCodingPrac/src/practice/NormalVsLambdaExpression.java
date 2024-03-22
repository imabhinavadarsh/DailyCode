/*
package practice;
import java.util.*;
//This is normal 
interface Interf{
	public void add(int a, int b);
}
class PracDemo implements Interf{
	public void add(int a, int b) {
		System.out.println("Sum : " + (a+b));
	}
}
public class NormalVsLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracDemo d = new PracDemo();
		d.add(10, 90);
	}

}
*/

//THIS IS BY USING LAMBDA EXPRESSION 

package practice;
import java.util.*;
interface Interf{
	public void add(int a, int b);
}
public class NormalVsLambdaExpression{
	public static void main(String [] args) {
		Interf i = (a, b) -> System.out.println("Sum : "+ (a+b));
		i.add(10, 90);
	}
}


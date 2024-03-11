//Set the 2 nd bit (position) of a number n; (n = 0101)
//1> bitMask: i << 1
//2> operation OR
package practice;
import java.util.*;
public class bitManipulationOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;//0101
		int pos = 1;
		int bitMask = 1<<pos;
		int newNumber = bitMask | n;
		System.out.println(newNumber);
	}

}

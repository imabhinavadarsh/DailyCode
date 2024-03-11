/*Get the 3rd bit (position = 2) of a number n,(n = 0101)
bitMask: 1 << i
Operator: And
Step 1: do the shifting 
Step to perform the bitwise operator
*/
package practice;
import java.util.*;
public class bitManipulationBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;//0101
		int pos = 2;
		int bitMask = 1 << pos;
		if((bitMask & n) == 0){
			System.out.println("Bit was zero");
		}else {
			System.out.println("Bit was one");
		}

	}

}

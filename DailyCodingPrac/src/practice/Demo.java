package practice;
import java.io.Serializable;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1 = new ArrayList ();
		LinkedList l2 = new LinkedList ();
		Vector l3 = new Vector();
		System.out.println(l1 instanceof Serializable);//True
		System.out.println(l2 instanceof Cloneable);//True
		System.out.println(l1 instanceof RandomAccess);//True
		System.out.println(l2 instanceof RandomAccess);//false
		System.out.println(l3 instanceof RandomAccess);//True
	}

}

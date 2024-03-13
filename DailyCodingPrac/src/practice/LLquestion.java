//Make a LinkedList and add the following elements to it (1,5,7,3,8,2,3);
//now your task it to search for the number 7 and display its index
package practice;
import java.util.LinkedList;
public class LLquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.addFirst(1);		
		l1.addLast(5);
		l1.addLast(7);
		l1.addLast(3);
		l1.addLast(8);
		l1.addLast(2);
		l1.addLast(3);
		System.out.println(l1);
		//Search for number 7 and display the index
		for(int i = 0; i < l1.size(); i ++) {//with the help of this loop I will traverse in the linkedList
			if(l1.get(i) == 7) {//with the help of .get(i) I am comparing at6 which Index is equal to 7
				System.out.println(i);//with the help of this I am printing that index
			}
		}
		


	}

}

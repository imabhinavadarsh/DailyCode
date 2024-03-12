package practice;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("b");
		list.addFirst("a");
		list.add("h");
		System.out.println(list);
		list.addLast("i");
		System.out.println(list);
		//size
		System.out.println(list.size());
		
		//print
		for(int i = 0; i< list.size();i++) {
			System.out.print(list.get(i) + "->");
		}
		 System.out.print("Null");
	}

}

package practice;

public class danglingElse {

	public static void main(String[] args) {
		if(true)
			if(true)
				System.out.println("Hi");
			else
				System.out.println("Hello");

	}

}

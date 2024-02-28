//Question: W A P to take input from user in (int , char, string, boolean)? 
package practice;
import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        int num;
        String s;
        char ch;
        boolean b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        num = sc.nextInt();
        sc.nextLine();
        System.out.println("Integer Entered: " + num);
        System.out.println("Enter a string:");
        s = sc.nextLine();
        System.out.println("String Entered: " + s);
        System.out.println("Enter a character:");
        ch = sc.next().charAt(0);
        System.out.println("Character Entered: " + ch);        
        System.out.println("Enter a boolean (true/false):");
        b = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Boolean Entered: " + b);   
        sc.close();     
    }
}

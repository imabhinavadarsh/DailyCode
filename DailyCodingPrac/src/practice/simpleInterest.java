package practice;// package is a group of relatable classes and interface into a unit.
import java.util.*;// here I am importing all the util classes and packages.
public class simpleInterest {// Here public is the access modifier.(We are creating the class with name simpleInteresst

	public static void main(String[] args) {//public is the access modifier so that jvm can access it from anywhere, we use static because without having the object our jvm could call it , void is the return type after execution in whatever data type my result is in it could be displayed easily on console. main is the name which is configured in jvm strictly prohibited to change the name of main method. (String [] args) it a string array of arguments, (Know as command line argument)  
		Scanner sc = new Scanner(System.in);//creating scanner object sc is the name of obj. creating new instance of object so at run time it take input from user . system.in to take input. 
		System.out.println("Enter the amount");//Displaying message 
		Float p = sc.nextFloat();//taking input in Data Type Float (to take decimal values also)
		System.out.println("Enter the rate of interest: ");// Displaying message
		Float r = sc.nextFloat();////taking input in Data Type Float (to take decimal values also)
		System.out.println("Enter the Time");//Displaying message
		float t = sc.nextFloat();//taking input in Data Type Float (to take decimal values also)
		float si = (p*r*t);//creating variable si used data type float to store vale (Simple Interest foramla : principle * rate * time)
		System.out.println("Simple Interest is " + si);//displaying message with si 
		//system is the class present in java.lang ;
		//out is the static variable present in system class . of type printstream.
		//println() is the method present in printstream class.


	}

}

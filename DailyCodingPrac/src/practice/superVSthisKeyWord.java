package practice;
import java.util.*;
class Animal{
	String s = "Animal can walk";
	String s1 = "Animal can eat";
}
class Horse extends Animal{
	String s = " Horse can run";
	String s1 = "Horse is fast";
	public void m1() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println(s1);
		System.out.println(this.s1);
		System.out.println(super.s1);

	}
}
public class superVSthisKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse hs = new Horse();
		hs.m1();
	}

}

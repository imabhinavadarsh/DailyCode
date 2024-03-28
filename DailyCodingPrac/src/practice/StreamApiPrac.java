package practice;
import java.util.*;
import java.util.stream.*;
public class StreamApiPrac {

	public static void main(String[] args) {
		// Creating ArrayList and adding values 
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(2);
		al.add(0);
		al.add(1);
		al.add(120);
		al.add(250);
		System.out.println(al);
		
		//Performing sorted 
		
		List<Integer> sortedList = al.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//Performing descending sort
		
		List<Integer> descendingSort = al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(descendingSort);
		
		//adding grace marks +5 in each obj
		
		List<Integer> graceMarks = al.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(graceMarks);
		
		//checK no of failed Student marks below 30
		
		List<Integer> noOfFailedStudent = al.stream().filter(i->i<30).collect(Collectors.toList());
		System.out.println(noOfFailedStudent);
		
		//print on colsole 
		
		al.stream().forEach(System.out::println);
	}

}

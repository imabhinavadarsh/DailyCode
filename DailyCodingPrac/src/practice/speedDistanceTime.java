/*package practice;
import java.util.*;
public class speedDistanceTime {
	
	//In this method where I am calculating the speed 
	public double calculateSpeed(double distance, double time) {
		return distance / time;
	}
	public double calculateTime(double speed, double distance) {
		return distance / speed;
	}
	public double calculateDistance(double speed, double time) {
		return speed * time;
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		speedDistanceTime calculate = new speedDistanceTime();
		System.out.println("Enter the Speed in km/hr");
		double speed = sc.nextDouble();
		System.out.println("Enter the Distance travel in km");
		double distance = sc.nextDouble();
		System.out.println("Time: " + calculate.calculateSpeed(10, 1) + " km/h");

	    }
		

	}

*/
package practice;
import java.util.*;

public class speedDistanceTime {
	
	// Method to calculate speed
	public double calculateSpeed(double distance, double time) {
		return distance / time;
	}
	
	// Method to calculate time
	public double calculateTime(double speed, double distance) {
		return distance / speed;
	}
	
	// Method to calculate distance
	public double calculateDistance(double speed, double time) {
		return speed * time;
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		speedDistanceTime calculate = new speedDistanceTime();
		
		// Taking input from the user
		System.out.println("Enter the Speed in km/hr");
		double speed = sc.nextDouble();
		System.out.println("Enter the Distance traveled in km");
		double distance = sc.nextDouble();
		
		// Calculating and displaying time
		double time = calculate.calculateTime(speed, distance);
		System.out.println("Time taken: " + time + " hours");
		
		sc.close(); // Closing the scanner
	}
}

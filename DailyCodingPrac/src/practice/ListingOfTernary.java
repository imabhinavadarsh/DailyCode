/*Traffic Light Problem
Imagine yourself at a virtual traffic junction, poised to navigate through the bustling city streets. 
As you approach, you encounter a traffic light conundrum awaiting your input!

Your task is to craft a console-based experience that prompts the user to decipher the traffic light's signal. 
Upon input, display the corresponding traffic directive and offer guidance for safe passage.

Here's the scenario:

The user is prompted to enter the symbol displayed by the traffic light:
"G" for green,
"R" for red, or
"Y" for yellow.
Based on the user's input, provide the following responses:

If the user enters "G":

Output: "Thank you for your patience! You're clear to GO."
If the user enters "R":

Output: "Kindly come to a complete stop."
If the user enters "Y":

Output: "Prepare to decelerate. Slow down, and be prepared to halt if necessary."
 */

package practice;
import java.util.*;
public class ListingOfTernary {

	public static void main(String[] args) {
		System.out.println(".....................WELCOME TO MY SMALL TRAFFIC LIGHT PROJECT.....................");
		System.out.println("------------------------------>>>FOR 'GREEN    G'<<<-------------------------------");
		System.out.println("------------------------------>>>FOR 'RED      R'<<<-------------------------------");
		System.out.println("------------------------------>>>FOR 'YELLOW   Y'<<<-------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Type Color FirstLetter:");
		String sign = sc.nextLine();
		String display = sign.equals("R") ? "Kindly come to a complete stop." :   sign.equals("G") ? "Thank you for your patience! You're clear to GO." :"Prepare to decelerate. Slow down, and be prepared to halt if necessary.";
		System.out.println(display);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Obey the traffic rules; your safety is worth more than a shortcut");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("EMERGENCY CONTACT DETAILS");
		System.out.println("FIRE BRIGADE: DIAL 101");
		System.out.println("POLICE: DIAL 100");
		System.out.println("AMBULANCE: DIAL 102");
		System.out.println("WOMEN'S SAFETY HELPLINE (ALL INDIA WOMEN HELPLINE): DIAL 1091");

	}

}

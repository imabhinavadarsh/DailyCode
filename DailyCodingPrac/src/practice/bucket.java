package practice;
import java.util.*;
public class bucket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String passWord = "123456asdfg@!#";
        StringBuilder characterBucket = new StringBuilder();
        StringBuilder numberBucket = new StringBuilder(); 
        StringBuilder specialCharacterBucket = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < passWord.length(); i++) {
            char ch = passWord.charAt(i);
            // Check if the character is alphabetic
            if (Character.isLetter(ch)) {
                characterBucket.append(ch);
            }
            // Check if the character is a digit
            else if (Character.isDigit(ch)) {
                numberBucket.append(ch); 
            }
            // If the character is neither alphabetic nor a digit, it's a special character
            else {
                specialCharacterBucket.append(ch);
            }
        }

        // Print the contents of each bucket
        System.out.println("Characters: " + characterBucket);
        System.out.println("Numbers: " + numberBucket);
        System.out.println("Special Characters: " + specialCharacterBucket);
    }
}
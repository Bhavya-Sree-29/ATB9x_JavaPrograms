package Oct.ex_22102024;
import java.util.*;

public class Lab060 {
    public static void main(String[] args) {
        //Palindrome of String (charAt())
        //Create a program that checks whether a given string is a palindrome.
        // A palindrome is a word or phrase that reads the same backward as forward (ignoring spaces, punctuation, and capitalization).
        // Use an if-else statement to determine if the string is a palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.next();

        // Convert to lowercase to ignore case sensitivity
        String original = s.toLowerCase();

        // Create a reversed version of the string
        String reversed = "";
        for(int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Check if palindrome using if-else
        if(original.equals(reversed)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }

        sc.close();

    }
}

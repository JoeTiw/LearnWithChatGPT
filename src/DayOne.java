/*
 From a given string, count the total number of vowels.
 */
import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {

        int count = 0; // counter for vowels
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a string: "); // prompt user for input
        String s = sc.nextLine(); // Read user input

        char[] c = s.toCharArray(); // convert string to char array

        for (char ch : c) { // for each loop to iterate through char array
            // check if char is a vowel
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
                count++; // increment counter
            }

        }
        System.out.println("The total amount of vowels are: " + count); // print total amount of vowels
    }
}
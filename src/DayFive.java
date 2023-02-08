/*
Write a program that will generate a random password, given a desired password length.
 The password should contain a mixture of upper and lowercase letters, numbers, and symbols.
 The symbol characters that should be included are: !@#$%^&*.
 The password should be generated in a way that ensures the security of the password,
 meaning it should not be easily guessable.
 */

//- I need a random import
// a variable that stores password length so in this case it would be an int
// create symbol char variable
//think about the security which you can do at the end



import java.util.Random;
import java.util.Scanner;


public class DayFive {

    public static void passCreator(){

        int passLength;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password Length: ");
        passLength = sc.nextInt();

        Random rn = new Random();
        StringBuilder password = new StringBuilder();
        String s = "!@#$%^&*";

        for (int i = 0; i < passLength; i++) {
            int num = rn.nextInt(3);
            if (num == 0) {
                char lowerCase = (char) (rn.nextInt(26) + 'a');
                password.append(lowerCase);
            } else if(num == 1) {
                int randIdx = new Random().nextInt(s.length());
                char randChar = s.charAt(randIdx);
                password.append(randChar);

            }else{
                char upperCase = (char) (rn.nextInt(26) + 'A');
                password.append(upperCase);
            }
        }
        System.out.println("Generated Password: " + password);
    }



    public static void main(String[] args) {
        passCreator();

    }

}

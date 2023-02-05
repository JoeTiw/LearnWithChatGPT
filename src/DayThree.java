
/*

Write a program that takes a string as input and outputs the string in reverse.
For example, if the input is "Hello", the output should be "olleH".

 */

import com.sun.jdi.event.StepEvent;

public class DayThree {


    public static void reverseString(){
        String s = "Hello";

        StringBuilder sb = new StringBuilder(s);
        System.out.print(sb.reverse());

    }

    public static void reverseAgain(){
        String a = "Hello";
        char[] c = a.toCharArray();
        for(int i = c.length - 1; i >= 0; i--){
            System.out.print(c[i]);
        }
    }


    public static void main(String[] args) {
        reverseString();
        System.out.println();
        reverseAgain();
    }

}

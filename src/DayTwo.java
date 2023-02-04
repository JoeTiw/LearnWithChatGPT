/*
Fibonacci Sequence - Enter a number and have the program generate
the Fibonacci sequence to that number or to the Nth number.
*/



public class DayTwo {
    public static void fibonacci(int n){

        int firstNum = 1;
        int secondNum = 1;
        int iterateNum = 0;

        for(int i = 0; i < n; i++){
            iterateNum = firstNum + secondNum;

            System.out.print(iterateNum + " ");

            firstNum = secondNum;
            secondNum = iterateNum;

        }

    }


    public static void main(String[] args) {

        fibonacci(10);

    }
}

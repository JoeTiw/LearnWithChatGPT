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

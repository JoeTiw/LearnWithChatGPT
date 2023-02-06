/*
arr = [1,2,3,4,5];
Multiply the adjacent elems
1*2 = 2
2*3 = 6

Find the largest product;
 */

public class DayFour {


    public static void findProd() {

        int[] arr = {2, 9, 1, 2, 5};
        int result = 0;
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            result = arr[i] * arr[i + 1];
            System.out.print(result + " ");
            if (result > max) {
                max = result;
            }
        }
        System.out.println();
        System.out.print("The biggest prod: " + max);
    }


    public static void main(String[] args) {
        findProd();
    }


}

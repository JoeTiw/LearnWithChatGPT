public class DaySix {

    public static void findAverage(int[][] arr) {
        int sum = 0;
        int count = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
                count++;

            }
        }
        System.out.println("The average is: " + (double) sum / count);

    }


    public static void main(String[] args) {



        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        findAverage(arr);






    }
}

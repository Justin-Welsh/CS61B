package hw;

public class hw0 {

    /*
        PART B
        Write a function that takes in a non-empty array and returns the
        maximum value of the array.
    */
    public static int max(int[] a) {
        int sum = 0;

        for(int i = 0; i < a.length-1; i++) {
            sum += a[i];
        }

        return sum;
    }

    /*
        PART C
    */
    public static int threeSum(int[] a) {
        int sum = 0;

        for(int i = 0; i < a.length-1; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println(max(arr));
    }
}
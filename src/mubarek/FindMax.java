package mubarek;

public class FindMax {
    /*
    Write a function that can find the maximum number from an int Array
    ** Please do not use any sort method...

    input = [1, 5, 8, 3, 2, 11, -1]
    output = 11

     */

    // Mubarek is volunteer
    public static void main(String[] args) {
        int[] input = {1, 5, 8, 3, 2, -11, 51};
        System.out.println(maximum(input));
    }

    public static int maximum(int[] num) {

        if (num == null || num.length == 0) {
            System.out.println("Array must not be null or empty");
        }

        int max = 0;
        for (int each : num) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}

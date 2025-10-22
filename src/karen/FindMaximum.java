package karen;

public class FindMaximum {

    public static void main(String[] args) {
        int[] input = {1, 5, 8, 3, 2, 11, -1};
        int maxNumber = findMax(input);
        System.out.println("Maximum number is: " + maxNumber);
    }

    /*
    Write a function that can find the maximum number from an int Array
    ** Please do not use any sort method...

    input = [1, 5, 8, 3, 2, 11, -1]
    output = 11
     */

    public static int findMax(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
}

package shaista;

public class FindMaximum {

    /*
    Write a function that can find the maximum number from an int Array
    ** Please do not use any sort method...

    input = [1, 5, 8, 3, 2, 11, -1]
    output = 11

     */

    public static int findMax(int[] arr) {
        int max = arr[0]; //assume first element is the largest
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i]; //update max if current element is larger
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] input = {1, 5, 8, 3, 2, 11, -1};
        System.out.println(findMax(input));
    }
}

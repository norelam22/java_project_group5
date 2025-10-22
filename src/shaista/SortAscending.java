package shaista;

import java.util.Arrays;

public class SortAscending {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method11

    input :  {1, 5, 8, 3, 2, 11, -1}
    output : [-1, 1, 2, 3, 5, 8, 11]

     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortAscending(1, 5, 8, 3, 2, 11, -1)));
    }

    public static int[] sortAscending(int... arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

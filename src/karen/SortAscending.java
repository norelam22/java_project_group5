package karen;

public class SortAscending {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 3, 2, 11, -1};
        sortAscending(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }


    public static void sortAscending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}

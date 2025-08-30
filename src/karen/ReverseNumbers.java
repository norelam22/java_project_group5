package karen;

public class ReverseNumbers {
    /*
    Write a return method that can reverse
negative number and return it as int
     */
    public static void main(String[] args) {
        System.out.println(reverse(-3453));
        System.out.println(reverse(-8746));
        System.out.println(reverse(-6452));
    }

    public static int reverse(int num) {
        int reversed = 0;

        if (num < 0) {
            num = -num;
            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

        }
        return reversed;
    }

}

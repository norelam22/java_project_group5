package erasto;

public class JavaQuestion01 {
    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");

        }
    }
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(8);

    }
}

/*
Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
 */
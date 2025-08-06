package mubarek;

public class OddOrEven {

    public static void main(String[] args) {
        System.out.println(oddOrEven(11));
        System.out.println(oddOrEven(52));
    }

    /*
        Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
    */
    public static String oddOrEven(int num) {
        return (num % 2 == 0 ? num + " is Even Number." :num+ " is Odd number.");
    }
}

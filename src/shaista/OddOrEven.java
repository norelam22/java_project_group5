package shaista;
/*
Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
 */

public class OddOrEven {

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(6);
        oddOrEven(657);
        oddOrEven(8768);
    }

public static void oddOrEven(int num) {
    if(num % 2 == 0) {
        System.out.println(num + " is an even number");
    }else{
        System.out.println(num + " is odd number");
    }
}

}

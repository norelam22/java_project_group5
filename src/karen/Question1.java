package karen;

public class Question1 {

    public static void main(String[] args) {

        System.out.println( oddOrEven(12) );
        System.out.println( oddOrEven(33) );

        }

        public static String oddOrEven(int number){
        if (number % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }

    }
}
/* Odd or Even
Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
 */

package mubarek;

public class SwapValue {
    public static void main(String[] args) {

        /*
    Swap two variable values without using a third variable
     */
        int num1 = 10;
        int num2 = 20;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}

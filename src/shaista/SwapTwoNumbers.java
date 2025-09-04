package shaista;

public class SwapTwoNumbers {


    public static void main(String[] args) {

        //Swap two variable values without using a third variable

        int a = 24;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

package anatoly;

public class SwapTwoVariables {

    public static void main(String[] args) {
        int a = 7;
        int b = 12;

        a = a + b; //19
        b = a - b; //7
        a = a - b; //12

        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}
/* Swap two variable values without using a third variable */
package karen;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        //#1- Approach -> Temporary variable

        int num1 = 5, num2 = 12, temp = 0;

        System.out.println("num1 before swaping = " + num1);
        System.out.println("num2 before swaping = " + num2);
        temp = num1;  //temp = 5
        num1 = num2;  //num1 = 12
        num2 = temp;  //num2 = 5
        System.out.println("num1 after swaping = " + num1);
        System.out.println("num2 after swaping = " + num2);
//---------------------------------------------------------------------------------
        //#2- Approach -> without variable, + & - operators

        int a = 10, b = 2;

        System.out.println("a before swaping = " + a);
        System.out.println("b before swaping = " + b);
        a = a + b;    //a = 12
        b = a - b;    //b = 10
        a = a - b;    //a = 2
        System.out.println("a after swaping = " + a);
        System.out.println("b after swaping = " + b);




    }



}

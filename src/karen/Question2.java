package karen;

public class Question2 {

    public static void main(String[] args) {

        FINRA();

    }

    public static void FINRA(){

        int number = 1;

        do {
            if (number % 3 == 0 && number % 5 ==0){
                System.out.print("FINRA ");
            }else if (number % 3 == 0){
                System.out.print("FIN ");
            }else if (number % 5 == 0){
                System.out.print("RA ");
            }else
                System.out.print(number + " ");

            number++;

        } while (number <= 30);

    }

}
/*

☑️  Java Question 02 - FINRA
 FINRA
     Write a function which prints out the numbers
     from 1 to 30 but for numbers which are a multiple of 3,
     print "FIN" instead of the number and
     for numbers which are a multiple of 5,
     print "RA" instead of the number.
     For numbers which are a multiple of both 3 and 5,
     print "FINRA" instead of the number.

 */
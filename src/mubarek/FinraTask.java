package mubarek;

public class FinraTask {

    public static void main(String[] args) {

        String print = "";

        // Loop through numbers 1 to 30.
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) { //If i divisible by both 3 and 5 print FINRA.
                print = "FINRA";
            } else if (i % 3 == 0) {   //else If i divisible by 3 print FIN.
                print = "FIN";
            } else if (i % 5 == 0) { //else If i divisible by 5 print RA.
                print = "RA";
            } else {
                System.out.print(i); // Else, not divisible by 3 or 5 → Print the number itself.
            }
            System.out.println(print);
        }
    }
}

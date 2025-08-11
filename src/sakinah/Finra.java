package sakinah;

public class Finra {

    public static void main(String[] args) {
       // Write a function which prints out the numbers
        //     from 1 to 30 but for numbers which are a multiple of 3,
        //     print "FIN" instead of the number and
        //     for numbers which are a multiple of 5,
        //     print "RA" instead of the number.
        //     For numbers which are a multiple of both 3 and 5,
        //     print "FINRA" instead of the number.
       for (int i = 1; i <= 30; i++) {
           String result = "";
           if (i % 3 == 0) result += "FIN";
           if (i % 5 == 0) result += "RA";

           if(result.isEmpty() ){
               System.out.println(i);
           }else{
               System.out.println(result);
           }
       }



    }
}

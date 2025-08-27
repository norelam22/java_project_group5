package amine;

public class finra {
    public static void main(String[] args) {

FINRA();
    }
    public static void FINRA(){
        String result = " ";
        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0 && i % 3 == 0) //multiple of both 3 and 5, print FINRA
                result += "FINRA";
            else if (i % 5 == 0)//
                result +="RA";
            else if (i % 3 ==0)
                result += "FIN";
            else
                result += i + " ";


        }
        System.out.println(result);
    }
}
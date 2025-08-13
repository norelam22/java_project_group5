package elena;

public class FINRA {
    public static void main(String[] args) {
        for (int num = 1; num <31 ; num++) {
            if(num%3==0 && num%5==0) {
                System.out.print(" ,FINRA: " + num);
            }else if(num%3==0){
                System.out.print(" FIN: "+num);
            }else if(num%5==0){
                System.out.print(" ,RA: "+num);

            }

        }
    }

    }


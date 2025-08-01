package oguz;

public class OddOrEven {


    public static void main(String[] args) {

        System.out.println(OddOrEven(25));
        System.out.println(OddOrEven(10));
        System.out.println(OddOrEven(0));

    }

    public static String OddOrEven (int num){
        if (num % 2 ==0 ){
            return "Even";
        }else{
            return  "Odd";
        }
    }
}

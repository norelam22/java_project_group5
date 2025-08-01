package emanuele;

public class OddOrEven {

    public static void main(String[] args) {

        oddOrEven(6);
        oddOrEven(9);

    }

    public static void oddOrEven(int num){

        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}

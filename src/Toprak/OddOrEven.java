package Toprak;

public class OddOrEven {
    public static void main(String[] args) {
        identify(5);
        identify(6);
    }
    public static void identify(int num){
        if(num%2==0){
            System.out.println(num+" is even ");
        }else {
            System.out.println(num+" is odd");
        }
    }
}

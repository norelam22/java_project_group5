package anatoly;

public class OddOrEven {

    public void identify(int number) {

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {

        OddOrEven obj = new OddOrEven();

        obj.identify(5);
        obj.identify(6);


    }

}

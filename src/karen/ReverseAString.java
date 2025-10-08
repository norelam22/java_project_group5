package karen;

public class ReverseAString {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        System.out.println(reverseString("HOLA AMIGOS"));

        String original = "KAREN MEDELLIN";
        StringBuilder stringBuilder = new StringBuilder(original);
        String reversed = stringBuilder.reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String originalStr){
        StringBuilder sb = new StringBuilder(originalStr);
        return  sb.reverse().toString();
    }
}

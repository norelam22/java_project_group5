package shaista;

public class ReverseString {

     /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverseString(String str) {
    String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;

    }
    public static void main(String[] args) {

        System.out.println(reverseString("Hello World"));
        System.out.println(reverseString("ABCD"));
    }
}

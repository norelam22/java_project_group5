package emanuele;

public class ReverseString {

    public static void main (String [] args){


        String str1 = "Emanuele";
        StringBuilder builder = new StringBuilder(str1);
        String reverse2 =   builder.reverse().toString();
        System.out.println(reverse2);


        String bucket = "";

        for (int i = str1.length()-1; i>= 0 ; i--){
            bucket += str1.charAt(i);
        }
        System.out.println(bucket);

    }
}

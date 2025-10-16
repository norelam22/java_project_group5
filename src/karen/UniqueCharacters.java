package karen;

public class UniqueCharacters {

    public static void main(String[] args) {


        System.out.println(uniqueCharacters("AAABBBCCCDEF"));
    }

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static String uniqueCharacters(String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }
        }

        return unique;
    }
}

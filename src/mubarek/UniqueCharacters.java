package mubarek;

public class UniqueCharacters {


    /*
  Write a return method that can find the unique characters from the String
          Ex: unique("AAABBBCCCDEF") ==> "DEF";

   */
    public static void main(String[] args) {
        System.out.println("unique1 = " + uniqueChar("AAABBBCCCDEF"));
    }

    public static String uniqueChar(String str) {

        StringBuilder uniqueChar = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if (str.indexOf(eachChar) == str.lastIndexOf(eachChar)) { /*this line is checking if the char at index i
                 is equals with the lastIndexOf the char */
                uniqueChar.append(eachChar);
            }
        }
        return uniqueChar.toString();
    }


}

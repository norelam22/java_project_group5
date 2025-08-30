package karen;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        System.out.println(frequencyOfCh("AAABBCDD"));
        System.out.println(frequencyOfCh("kkarrreeenn"));
    }

    public static String frequencyOfCh(String str) {
        if (str.isEmpty()){
            return "";
        }

        String result = "";
        int count = 1;
        char current = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == current){
                count++;
            } else {
                result += current + "" + count;
                current = str.charAt(i);
                count = 1;
            }
        }

        result += current + "" + count;
        return result;
    }
}

package anatoly;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfCharacters {

    public static String countFrequency(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        for (char each : str.toCharArray()) {
            if (!map.containsKey(each)) {
                map.put(each, 1);
            } else {
                map.put(each, map.get(each) + 1);
            }
        }

        for (char key : map.keySet()) {
            result.append(key);
            result.append(map.get(key));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(countFrequency("AAABBCDDAAABBBBBBB"));
    }
}

 /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

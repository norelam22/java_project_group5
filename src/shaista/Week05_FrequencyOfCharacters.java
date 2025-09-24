package shaista;

/*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

import java.util.LinkedHashMap;
import java.util.Map;

public class Week05_FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(countFrequency("AAABBCDD"));
    }

    public static String countFrequency(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();//remember insertion order
        for(char each : str.toCharArray()){
            if(!map.containsKey(each)){
                map.put(each, 1);
            }else{
                //if already in a map, update count +1
                map.put(each, map.get(each) + 1);
            }
            //   map.put(each, map.getOrDefault(each, 0) + 1);
        }
        String result = "";
        for(char key : map.keySet()){
            result += key;
            result += map.get(key);
        }

        return result;
    }
    }


package karen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBBBCCCCDDDD"));
        System.out.println(removeDuplicates("kkkaaaaakkkrrrreeennnneee"));
    }


    public static String removeDuplicates(String str){

        String holder= "";

        for (char each : str.toCharArray()){
            if (!holder.contains(String.valueOf(each))){
                holder += each;
            }

        }

        return holder;

    }
}

package oguz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "A", "A", "B", "B", "B", "C", "C", "C"));

        System.out.println("Unique elements: " + removeDup(list));

    }


    public static Set<String> removeDup(ArrayList<String> inputList) { //Coverting ArrayList to Set
        return new LinkedHashSet<>(inputList);  //Insertion order
    }

}

    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC

     */

// Oguz is volunteer

package weekly_tasks_from_Troy;

public class Week06_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    // Oguz is volunteer

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);// I will concatenate the letter into my String
                                             // result if that letter is not included into result
            }//AB
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }




}

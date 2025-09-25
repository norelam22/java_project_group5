package mubarek;

public class RemoveDuplicates {

    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCCGGHHJJKKOHY"));
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();

        for (char each : str.toCharArray()) {
            if (!result.toString().contains("" + each)) {
                result.append(each);
            }
        }
        return result.toString();
    }
}

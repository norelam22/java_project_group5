package shaista;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {

    String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains(String.valueOf(ch))) {
                result += ch;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
    }
}

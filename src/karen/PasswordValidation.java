package karen;

public class PasswordValidation {

    public static void main(String[] args) {

        System.out.println("Is valid? " + isValidPassword("Abc@123"));
        System.out.println("Is valid? " + isValidPassword("abc@123"));
        System.out.println("Is valid? " + isValidPassword("Abc123"));
    }

    public static boolean isValidPassword(String password) {

        if (password == null || password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;


        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }


        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

}

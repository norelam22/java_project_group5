package erasto;

public class JavaQuestion10 {

    public static boolean isValidPassword(String password) {


        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;


        for (char each : password.toCharArray()) {

            if (Character.isUpperCase(each)) {
                hasUpper = true;
            } else if (Character.isLowerCase(each)) {
                hasLower = true;
            } else if (Character.isDigit(each)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }


        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("Abc123!"));
        System.out.println(isValidPassword("abc123"));
        System.out.println(isValidPassword("ABC!23"));
    }
}

 /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */

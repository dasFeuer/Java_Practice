package Password_Generator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static final String PasswordPattern =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private static final Pattern pattern = Pattern.compile(PasswordPattern);

    public static boolean isValid(final String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testPasswords = {
                "Password123!",
                "pass123",
                "PASSWORD123!",
                "Password!",
                "Password123",
                "Pass123!pass123!pass123!"
        };

        for (String password : testPasswords) {
            System.out.println("Password: " + password + " is valid: " + isValid(password));
        }
    }
}

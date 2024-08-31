package Password_Generator;


import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class PasswordGenerator {
        private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
        private static final String UPPERCASE = LOWERCASE.toUpperCase();
        private static final String DIGIT = "0123456789";
        private static final String PUNCTUATION = "!@#&()–[{}]:;',?/*";
        private static final String SYMBOL = "~$^+=<>";
        private static final String SPECIAL = PUNCTUATION + SYMBOL;
        private static final int LENGTH = 20;
        private static final String ALLOW_PASSWORD = LOWERCASE + UPPERCASE + DIGIT + SPECIAL;
        private static final SecureRandom random = new SecureRandom();

        public static void generatePassword(){
            StringBuilder result = new StringBuilder(LENGTH);

            String stringLowerCase = generateRandomString(LOWERCASE, 2);
            System.out.format("%-20s: %s%n", "Chars (Lowercase)", stringLowerCase);
            result.append(stringLowerCase);

            String stringUpperCase = generateRandomString(UPPERCASE, 2);
            System.out.format("%-20s: %s%n", "Chars (Uppercase)", stringUpperCase);
            result.append(stringUpperCase);

            String stringDigit = generateRandomString(DIGIT, 2);
            System.out.format("%-20s: %s%n", "Digits", stringDigit);
            result.append(stringDigit);

            String stringSpecialChar = generateRandomString(SPECIAL, 2);
            System.out.format("%-20s: %s%n", "Special chars", stringSpecialChar);
            result.append(stringSpecialChar);

            String stringOther = generateRandomString(ALLOW_PASSWORD, LENGTH - 8);
            System.out.format("%-20s: %s%n", "Others", stringOther);
            result.append(stringOther);


            String password = result.toString();
            System.out.format("%-20s: %s%n", "Password", password);
            System.out.format("%-20s: %s%n", "Final password", shuffleString(password));
            System.out.format("%-20s: %s%n", "Password length", password.length());

        }

        private static String generateRandomString(String input, int size){
            if(input == null || input.length() <= 0){
                throw new IllegalArgumentException("Invalid input.");
            }
            if(size < 1) {
                throw new IllegalArgumentException("Invalid size.");
            }
            StringBuilder result = new StringBuilder(size);
            for (int i = 0; i < size; i++) {
                int index = random.nextInt(input.length());
                result.append(input.charAt(index));
            }
            return result.toString();
        }

        public static String shuffleString(String input){
            List<String> result = Arrays.asList(input.split(""));
            Collections.shuffle(result);
            return String.join("", result);
        }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            generatePassword();
        }
    }
}




//package Password_Generator;

//import java.security.SecureRandom;
//import java.util.Collections;
//import java.util.List;
//import java.util.Arrays;
//
//public class PasswordGenerator {
//    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
//    private static final String UPPERCASE = LOWERCASE.toUpperCase();
//    private static final String DIGIT = "0123456789";
//    private static final String PUNCTUATION = "!@#&()–[{}]:;',?/*";
//    private static final String SYMBOL = "~$^+=<>";
//    private static final String SPECIAL = PUNCTUATION + SYMBOL;
//    private static final String ALLOW_PASSWORD = LOWERCASE + UPPERCASE + DIGIT + SPECIAL;
//
//    private static final int MIN_LOWERCASE = 2;
//    private static final int MIN_UPPERCASE = 2;
//    private static final int MIN_DIGIT = 2;
//    private static final int MIN_SPECIAL = 2;
//    private static final int PASSWORD_LENGTH = 20;
//
//    private static final SecureRandom random = new SecureRandom();
//
//    public static void generatePassword() {
//        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
//
//        password.append(generateRandomString(LOWERCASE, MIN_LOWERCASE));
//        password.append(generateRandomString(UPPERCASE, MIN_UPPERCASE));
//        password.append(generateRandomString(DIGIT, MIN_DIGIT));
//        password.append(generateRandomString(SPECIAL, MIN_SPECIAL));
//
//        int remainingLength = PASSWORD_LENGTH - password.length();
//        if (remainingLength > 0) {
//            password.append(generateRandomString(ALLOW_PASSWORD, remainingLength));
//        }
//
//        String finalPassword = shuffleString(password.toString());
//
//        System.out.format("%-20s: %s%n", "Final password", finalPassword);
//        System.out.format("%-20s: %d%n", "Password length", finalPassword.length());
//    }
//
//    private static String generateRandomString(String input, int size) {
//        if (input == null || input.isEmpty()) {
//            throw new IllegalArgumentException("Invalid input.");
//        }
//        if (size < 1) {
//            throw new IllegalArgumentException("Invalid size.");
//        }
//        StringBuilder result = new StringBuilder(size);
//        for (int i = 0; i < size; i++) {
//            int index = random.nextInt(input.length());
//            result.append(input.charAt(index));
//        }
//        return result.toString();
//    }
//
//    public static String shuffleString(String input) {
//        List<String> result = Arrays.asList(input.split(""));
//        Collections.shuffle(result);
//        return String.join("", result);
//    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            generatePassword();
//        }
//    }
//}

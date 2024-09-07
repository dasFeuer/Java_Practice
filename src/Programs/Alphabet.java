package Programs;

import java.util.Arrays;

public class Alphabet {
    public static void printAlphabet(char[] letters){
        for (int i = 0; i < 26; i++) {
            letters[i] = (char)('A' + i);
        }
        System.out.println(Arrays.toString(letters));
    }

    public static void main(String[] args) {
        char[] letters = new char[26];

        printAlphabet(letters);

    }
}

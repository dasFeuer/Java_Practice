package Programs;

import java.util.Scanner;

public class FindChar {
    static void findTheLetter(char[] chars, String letter) {
        if(letter.isEmpty()){
            System.out.println("Input not provided");
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (letter.charAt(0) == chars[i]){
                System.out.println("Letter present: " + letter);
                return;
            }
        }
        System.out.println("Letter not present: " + letter);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        System.out.print("Enter a single letter to search: ");
        String letter = sc.next();

        findTheLetter(chars, letter);
    }
}

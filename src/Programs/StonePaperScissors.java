package Programs;
// Method 1 von While loop

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissors {

    public static String userInput;
    public static String computer;
    public static String playOrEndGame;
    public static Scanner sc = new Scanner(System.in);

    public static void playGame() {
        while (true) {
            String[] moves = {"stone", "paper", "scissors"};
            computer = moves[new Random().nextInt(moves.length)];
            System.out.println();
            System.out.println("Computer has chosen it's move!");
            System.out.println();
            System.out.print("It's your turn to chose from Stone/Paper/Scissors: ");
            userInput = sc.nextLine().toLowerCase();

            if (!"paper".equals(userInput) && !"stone".equals(userInput) && !"scissors".equals(userInput)) {
                System.out.println("Computer chose " + computer);
                System.out.println("Invalid! " + userInput + " is not valid input.\n");
            } else if (userInput.equals("paper") && computer.equals("stone")) {
                System.out.println("Computer chose " + computer);
                System.out.println("You chose " + userInput);
                System.out.println("You win!\n");
            } else if (userInput.equals("scissors") && computer.equals("paper")) {
                System.out.println("Computer chose " + computer);
                System.out.println("You chose " + userInput + " and computer chose " + computer);
                System.out.println("You win!\n");
            } else if (userInput.equals("stone") && computer.equals("scissors")) {
                System.out.println("Computer chose " + computer);
                System.out.println("You chose " + userInput);
                System.out.println("You win!\n");
            } else if (userInput.equals(computer)) {
                System.out.println("Computer chose " + computer);
                System.out.println("You chose " + userInput);
                System.out.println("Tie!\n");
            } else {
                System.out.println("Computer chose " + computer);
                System.out.println("You chose " + userInput);
                System.out.println("You lose!\n");
            }
            if(!endGame()) {
                break;
            }
        }
    }

    public static boolean endGame() {
        System.out.println("Do you want to continue?");
        while (true) {
            System.out.print("Enter Yes or No --> ");
            playOrEndGame = sc.nextLine().toLowerCase();
            System.out.println();
            if (!"yes".equals(playOrEndGame) && !"no".equals(playOrEndGame)) {
                System.out.println("Invalid input! Please enter 'Yes' or 'No'.");
            } else if (playOrEndGame.equals("no")) {
                System.out.println("Thank you for playing. GAME OVER!\nSee you next time!");
                return false;
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}


// Method 2 von Do-While loop

//import java.util.Random;
//import java.util.Scanner;
//
//public class StonePaperScissors {
//
//    public static String userInput;
//    public static String computer;
//    public static String playOrEndGame;
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void playGame() {
//        do {
//            String[] moves = {"stone", "paper", "scissors"};
//            computer = moves[new Random().nextInt(moves.length)];
//            System.out.println();
//            System.out.println("Computer has chosen it's move!");
//            System.out.println();
//            System.out.print("It's your turn to chose from Stone/Paper/Scissors: ");
//            userInput = sc.nextLine().toLowerCase();
//
//            if (!"paper".equals(userInput) && !"stone".equals(userInput) && !"scissors".equals(userInput)) {
//                System.out.println("Computer chose " + computer);
//                System.out.println("Invalid! " + userInput + " is not valid input.\n");
//            } else if (userInput.equals("paper") && computer.equals("stone")) {
//                System.out.println("Computer chose " + computer);
//                System.out.println("You chose " + userInput);
//                System.out.println("You win!\n");
//            } else if (userInput.equals("scissors") && computer.equals("paper")) {
//                System.out.println("Computer chose " + computer);
//                System.out.println("You chose " + userInput + " and computer chose " + computer);
//                System.out.println("You win!\n");
//            } else if (userInput.equals("stone") && computer.equals("scissors")) {
//                System.out.println("Computer chose " + computer);
//                System.out.println("You chose " + userInput);
//                System.out.println("You win!\n");
//            } else if (userInput.equals(computer)) {
//                System.out.println("Computer chose " + computer);
//                System.out.println("You chose " + userInput);
//                System.out.println("Tie!\n");
//            } else {
//                System.out.println("Computer chose " + computer);
//                System.out.println("You chose " + userInput);
//                System.out.println("You lose!\n");
//            }
//        } while (endGame());
//    }
//
//    public static boolean endGame() {
//        System.out.println("Do you want to continue?");
//        while (true) {
//            System.out.print("Enter Yes or No --> ");
//            playOrEndGame = sc.nextLine().toLowerCase();
//            System.out.println();
//            if (!"yes".equals(playOrEndGame) && !"no".equals(playOrEndGame)) {
//                System.out.println("Invalid input! Please enter 'Yes' or 'No'.");
//            } else if (playOrEndGame.equals("no")) {
//                System.out.println("Thank you for playing. GAME OVER!\nSee you next time!");
//                return false;
//            } else {
//                return true;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        playGame();
//    }
//}



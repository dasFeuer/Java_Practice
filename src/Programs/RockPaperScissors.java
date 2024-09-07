package Programs;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int attempts;
        Scanner sc = new Scanner(System.in);
        while(true) {
            String[] moves = {"Rock", "Paper", "Scissors"};
            String computerMove = moves[new Random().nextInt(moves.length)];

            System.out.println("Computer has chosen its move!");
            System.out.println();
            System.out.println("Now it's your turn to choose");
            System.out.println();

            String userMove;
            while (true) {
                System.out.println("Please choose your move from the available moves: 'Rock', 'Paper', 'Scissors'");
                System.out.print("Enter your move: ");
                userMove = sc.nextLine();

                if(userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors")) {
                    System.out.println();
                    break;
                }
                System.out.println();
                System.out.println("Invalid move!");
                System.out.println("Please enter your move from the available moves only!");
                System.out.println();
            }
            System.out.println("Computer chose: " + computerMove);
            if(userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (userMove.equals("Rock")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                }
            } else if (userMove.equals("Scissors")) {
                if(computerMove.equals("Paper")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                } else if (computerMove.equals("Rock")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                }
            } else if (userMove.equals("Paper")) {
                if(computerMove.equals("Rock")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                }
            }

            System.out.println();
            String playAgain;
            System.out.println("Do you want to play again?");

            while (true) {
                System.out.println("Type 'yes' or 'no':" );
                playAgain = sc.nextLine().toLowerCase();
                if(playAgain.equals("yes") || playAgain.equals("no")) {
                    System.out.println();
                    System.out.println("****************************************************");
                    System.out.println();
                    break;
                }
                System.out.println();
                System.out.println("Invalid input");
                System.out.println();
            }
            if(playAgain.equals("no")) {
                break;
            }
        }
    }
}

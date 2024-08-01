package OOPS_ZahlRaten;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess and input the number: ");
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses ++;
        if (inputNumber == number) {
            System.out.format("Congratulation! You guessed it right, it was %d\nYou guessed it in %d attempts.\n", number, noOfGuesses);
            return true;
        } else if(inputNumber < number) {
            System.out.println("Too low...guess higher!\n");
        } else {
            System.out.println("Too high...guess lower!\n");

        }
        return false;
    }

}

public class OOPS_Practice_Spiel {
    public static void main(String[] args) {
        Game spiel = new Game();
        boolean isNumCorrect = false;
        while(!isNumCorrect) {
            spiel.takeUserInput();
            isNumCorrect = spiel.isCorrectNumber();
        }

    }
}

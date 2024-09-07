package Programs;

import java.util.Random;

public class FlipTheCoin {

    public enum myCoin {
        HEADS, TAILS;
    }

    public enum Game {
        WIN, LOSE;
    }

    private static myCoin flip(){
        int random = new Random().nextInt(2);
        if(random==0) {
            return myCoin.HEADS;
        }
        return myCoin.TAILS;
    }

    public static boolean flipFor(myCoin picked) {
        System.out.println("Flipping.....");
        myCoin landed = flip();
        System.out.printf("Landed %s%n", landed);
        return (landed == picked);
    }

    public static void main(String[] args) {
        myCoin chose = myCoin.HEADS;
        System.out.printf("You chose %s%n", chose);
        Game game = flipFor(chose)? Game.WIN : Game.LOSE;
        System.out.printf("You %s%n", game);
    }
}

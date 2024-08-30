package ECHO;

import java.util.ArrayList;
import java.util.Scanner;

public class Echo {
    public static void printEcho(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> memory = new ArrayList<String>();

        System.out.println("1. Input to see ECHO.");
        System.out.println("2. Type 'CLEAR' to clear ECHO.");
        System.out.println("3. Type 'END' to end the ECHO/Program.");
        System.out.println("---------------------------------------");
        System.out.println();
        System.out.println("INPUT HERE:");
        while (true){
            memory.add(sc.nextLine());

            if((memory.getLast()).equals("CLEAR")){
                memory.clear();
            } else{
                if((memory.getLast()).equals("END"))
                    break;
            }
            System.out.println(memory.toString());
        }
    }
    public static void main(String[] args) {
        printEcho();
    }
}


import java.awt.event.ActionEvent;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;
// import java.awt.TextField;

public class Zahl_Raten {

    static int myNumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    static int tries = 0;
    static JLabel text = new JLabel("Gebe eine Zahl zwischen 0 und 100 ein!: ");
    static JTextField textField = new JTextField();

    public static void guess(int number) {
        if (number == myNumber) {
            System.out.println("Richtig geraten!");
            System.out.println("Du hast " + tries + " Versuche gebraucht!");
            text.setText("Richtig geraten mit " + tries + " Versuchen");

        } else {
            tries++;
            if (number < myNumber) {
                text.setText("Falsch geraten! Deine Zahl ist zu klein!\n");
            } else {
                text.setText("Falsch geraten! Deine Zahl ist zu groß!\n");
            }
            textField.setText("");
            //nextRound();
        }
    }

    // public static void nextRound() {
    //     tries++;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Bitte gebe eine Zahl ein: ");
    //     int number = sc.nextInt();
    //     guess(number);
    // }
    public static void openUI() {
        JFrame frame = new JFrame("Rate die Zahl!");
        frame.setSize(400, 300);
        frame.setLocation(100, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);

        text.setBounds(50, 50, 350, 30);

        textField.setBounds(50, 100, 200, 30);

        JButton button = new JButton("Raten!");
        button.setBounds(50, 150, 200, 30);

        button.addActionListener((ActionEvent e) -> {
            try {
                String textfromTextfield = textField.getText();
                Integer number = Integer.valueOf(textfromTextfield);
                guess(number);

            } catch (NumberFormatException error) {
                text.setText("Bitte gebe eine Zahl ein!");
            }

        });

        frame.add(text);
        frame.add(textField);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // nextRound();
        openUI();
    }
}

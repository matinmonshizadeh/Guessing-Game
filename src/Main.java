import java.util.Random;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        //Scanner scanner = new Scanner(System.in);

        // Selects a random number
        int selectedNumber = random.nextInt(100) + 1;

        while(true) {

            // Input (number guessed)
            int numberGuessed = Integer.parseInt(JOptionPane.showInputDialog("Guess the selected number:\n(number is between 1 and 100)"));
            // int numberGuessed = scanner.nextInt();

            if((selectedNumber == numberGuessed) && (numberGuessed >= 1) && (numberGuessed <= 100)) {
                JOptionPane.showMessageDialog(null, "Correct, You won");
                //System.out.println("Correct, You won");
                break;
            }else{
                if((selectedNumber > numberGuessed) && (numberGuessed >= 1) && (numberGuessed <= 100)) {
                    JOptionPane.showMessageDialog(null, "Wrong, Selected number is bigger than the number guessed by the player");
                    //System.out.println("Wrong, Selected number is bigger than the number guessed by the player");

                }else if((selectedNumber < numberGuessed) && (numberGuessed >= 1) && (numberGuessed <= 100)) {
                    JOptionPane.showMessageDialog(null, "Wrong, Selected number is smaller than the number guessed by the player");
                    //System.out.println("Wrong, Selected number is smaller than the number guessed by the player");
                }else {
                    JOptionPane.showMessageDialog(null, "Number guessed isn't between 1 and 100");
                    //System.out.println("Number guessed isn't between 1 and 100");
                }
            }
        }
    }
}

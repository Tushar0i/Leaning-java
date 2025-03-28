import java.util.Random;
import java.util.Scanner;

public class slotmachine {

    public static void main(String[] args) {
        System.out.println("In this we are going to make a java slot machine:");

        Scanner scanner = new Scanner(System.in);

        // Declare variables
        // Display welcome message
        // Play if balance = 0
        // Enter bet amount
        // verify if bet > balance
        // verify if bet > 0
        // Spin row
        // Print row
        // Get payout
        // Ask to play again
        // Display exit message

        int balance = 100;
        int bet;
        int payout = 0;
        String[] row;
        String playAgain;

        System.out.println("---------------------------");
        System.out.println("Welcome to Grand Java Slots");
        System.out.println("    Symbols: A B C D E");
        System.out.println("---------------------------");

        while (balance > 0) {
            System.out.println("Current balance: $" + balance);

            System.out.print("Place your bet ammount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance) {
                System.out.println("Insufficient balance!");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be grater then zero!!");
                continue;
            } else {
                balance -= bet;
            }

            System.out.println("Spinning.....");
            row = spinRow();

            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry you lost the amount!!");
            }
            
            System.out.print("Do you want to play again? (Y/N) ");
            playAgain = scanner.nextLine().toUpperCase();
            
            if (!playAgain.equals("Y")) {
                break;
            } 
        }


        System.out.println("-------------------------");
        System.out.println("      Game over");
        System.out.println("Your final balace is: $"+balance);

        System.out.println("-------------------------");
        

        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = { "A", "B", "C", "D", "E" };
        String[] row = new String[3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row) {

        System.out.println("-----------");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("-----------");

    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {

            return switch (row[0]) {
                case "A" -> bet * 3;
                case "B" -> bet * 4;
                case "C" -> bet * 5;
                case "D" -> bet * 10;
                case "E" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {

            return switch (row[0]) {
                case "A" -> bet * 2;
                case "B" -> bet * 3;
                case "C" -> bet * 4;
                case "D" -> bet * 5;
                case "E" -> bet * 10;
                default -> 0;

            };
        }else if(row[1].equals(row[2])){

            return switch (row[1]) {
                case "A" -> bet * 2;
                case "B" -> bet * 3;
                case "C" -> bet * 4;
                case "D" -> bet * 5;
                case "E" -> bet * 10;
                default -> 0;

            };

        }

        return 0;
    }

}

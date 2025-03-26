import java.util.Scanner;
import java.util.Random;

public class diceRoller {
    public static void main(String[] args) {
        System.out.println("In this we are going to create a small dice Rolling poject");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        // declearing  variables

        int dice ;
        int total=0;

        System.out.print("Enter the number of die you want to roll: ");
        dice = scanner.nextInt();

        // creating loop
        if (dice<=0) {
            System.out.println("Number of dice must be grater then zero !");
        } else {
            
            for(int i=1;i<=dice;i++){
    
                int number = random.nextInt(1,7);

                printDie(number);

                System.out.println("You Rolled : "+number);
              
                total+=number;
    
            }

            System.out.println("Total: " + total);

        }
    






        scanner.close();
    }
//creating a ASCII art for distplaing a dice
 static void printDie(int number){


    String dice1 = """
            ---------
            |       |
            |   ●   |
            |       |
            ---------
            """;
    String dice2 = """
            ---------
            |       |
            | ●   ● |
            |       |
            ---------
            """;
    String dice3 = """
            ---------
            | ●     |
            |   ●   |
            |     ● |
            ---------
            """;
    String dice4 = """
            ---------
            | ●   ● |
            |       |
            | ●   ● |
            ---------
            """;
    String dice5 = """
            ---------
            | ●   ● |
            |   ●   |
            | ●   ● |
            ---------
            """;
    String dice6 = """
            ---------
            | ●   ● |
            | ●   ● |
            | ●   ● |
            ---------
            """;

            switch(number){

                case 1 -> System.out.print(dice1);
                case 2 -> System.out.print(dice2);
                case 3 -> System.out.print(dice3);
                case 4 -> System.out.print(dice4);
                case 5 -> System.out.print(dice5);
                case 6 -> System.out.print(dice6);

                default -> System.out.print("Invalid Roll");
            }
 }

}

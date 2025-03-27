
import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors {
    
public static void main(String[] args) {
    //Declare variables

    //get choice from the user 
    
    //get random choice from the computer

    // check win condition

    // ask to play again

    //goodby message

    Scanner scanner = new Scanner(System.in);

    Random random = new Random();
    


    String[] choice = {"rock","paper","scissors"};
    
    String playerChoice;
    String computerChoices;
    String playAgain = "yes";
    
    do {
    
    System.out.print("Enter you move(rock,paper,scissors)->> ");

    playerChoice = scanner.nextLine().toLowerCase();


    if (!playerChoice.equals("rock")&& !playerChoice.equals("paper")&&!playerChoice.equals("scissors")) {

        System.out.println("Invalid choice!!");
        continue;
    
    }

    computerChoices = choice[random.nextInt(3)];
    System.out.println("Computer choice: "+computerChoices);


   if (computerChoices.equals(playerChoice)) {
        System.out.println("Its a tie!");
    } else if (

(computerChoices.equals("rock")&&playerChoice.equals("paper") ) ||
(computerChoices.equals("paper")&&playerChoice.equals("scissors") ) ||
(computerChoices.equals("scissors")&&playerChoice.equals("rock") ) 


    ){
        System.out.println("You win!");
    }

    else{

        System.out.println("You lose!");
    }

    System.out.print("Play again(yes/no):");
    playAgain = scanner.nextLine().toLowerCase();



        
    } while (playAgain.equals("yes"));


    System.out.println("Thanks for playing!");

    scanner.close();
}
}

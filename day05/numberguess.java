import java.util.Scanner;
import java.util.Random;

public class numberguess {
    public static void main(String[] args) {
        System.out.println("In this we are going to create number guessing game");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        

        int guess=0;
        int attempts=0;
        int randomNumber = random.nextInt(1,101);
        // System.out.println(randomNumber);

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100: ");

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("You are too low! Try again:");
            } else if (randomNumber < guess) {
                System.out.println("You are too high! Try again:");
            
            }
    
        }while(guess!= randomNumber);

        System.out.println("Your guess it correctly in "+attempts+ " attempts!");


        scanner.close();
    }
}

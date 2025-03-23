import java.util.Scanner;

public class l10{

    public static void main(String[] args) {
        
        System.out.println("In this we are going to learn about nested if statement");

        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        double price =9.990;

        System.out.print("Are you a student(true/false)? ");

        isStudent = scanner.nextBoolean();
        System.out.print("Are you a senior(true/false)? ");

        isSenior = scanner.nextBoolean();
        if(isStudent){
            if (isSenior) {
                System.out.println("You get a student discount of 10%");
                System.out.println("You get a senior discount of 20%");
                price *= 0.7;
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9; 
            }
            
        }
        else{
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            } else {
                price *= 1;
            }
            
        }

        System.out.printf("The price of ticket is $%.2f",price);
        scanner.close();
    } 
    
}
import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        System.out.println("This l4 is about user input in java");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();
        //if we use line insted of next line then it willnot read spaces on first thing

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student?(true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old.");
        System.out.println("Your gpa is: "+gpa);
        // System.out.println("Student: "+isStudent);
        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are not enrolled as a student");
        }
        //COMMON ISSUE
        /*
         * if we input a int and then a string 
         * due to input buffer we get the issue to
         * resolve the do following
         */

         System.out.print("Enter your child age: ");
         int childAge = scanner.nextInt();
         scanner.nextLine();

         System.out.print("Enter his/her favorite color: ");
         String color = scanner.nextLine();
         System.out.println("Your child is "+childAge+ " years old");
         System.out.println("He/She like color "+color);


        scanner.close();
    }
    
}

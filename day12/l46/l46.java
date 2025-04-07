import java.util.InputMismatchException;
import java.util.Scanner;

public class l46 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about about Exception in java");

        // Exception = An event that interrupts the normal flow of a program(Dividing by
        // zero, file not found, mismatch input type )
        // Surrounding any dangerous code with a try{} block

        // try{} , catch{} , finally{}

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(9 / 0);
        } catch (ArithmeticException e) {
        // TODO: handle exception
       System.out.println("YOU CAN'T DIVIDE BY ZERO!!");
        }
        try {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                System.out.println(number);

        } catch (InputMismatchException e) {
            System.out.println("ENTER A NUMBER ONLY!!");
        } catch (Exception e) {

            // Safety net
            System.out.println("Something went wrong !!!");
        }

        finally{
        System.out.println("This always executes!");
            scanner.close();
        }
    }

}
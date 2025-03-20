import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        System.out.println("This l4 is about user input in java");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);



        scanner.close();
    }
    
}

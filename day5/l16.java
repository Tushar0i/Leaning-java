import java.util.Scanner;

public class l16 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about while loops");

        Scanner scanner = new Scanner(System.in);

        // we dont want our variable to be empty if we are checking a condition

        String response = "";
        while (!response.equals("Q")) {
            System.out.println("Your are playing a game");
            System.out.println("Press Q to quit");
            response = scanner.next().toUpperCase();
            scanner.nextLine();

        }

        System.out.println("You have quit the game");

        int age = 0;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0) {
            System.out.print("Your age can't be negative: ");

            age = scanner.nextInt();
        }

        System.out.printf("You are %d years old\n", age);

        int number = 0;

        do {
            System.out.print("Enter a number  between 1 - 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();
    }
}

import java.util.Scanner;

public class shoppingcart {
    public static void main(String[] args) {
        System.out.println("In this file we are creating a shopping cart program");

        Scanner scanner = new Scanner(System.in);

        String item;
        Double price;
        int quantity;
        char currency = '₹';
        double total;

        System.out.print("Whats item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();
    }
}

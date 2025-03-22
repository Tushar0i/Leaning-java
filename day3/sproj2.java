import java.util.Scanner;

public class sproj2 {
    public static void main(String[] args) {
        System.out.println("In this we are going to create a compound intrest calculator");

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter your principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate(in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal*Math.pow(1+rate/timesCompounded, timesCompounded*years);

        System.out.printf("The amount after %d is: $%.2f ",years,amount);

        scanner.close();
    }
}

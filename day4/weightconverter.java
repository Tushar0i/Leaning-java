import java.util.Scanner;

public class weightconverter {
    public static void main(String[] args) {
        System.out.println("In this file we are going to create a weight convertor");

        Scanner scanner = new Scanner(System.in);

        double weight;
        String unitInitial;
        String untiFinal;

        System.out.print("Enter your weight: ");
        weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter your weight unit(kg/gram/lbs): ");
        unitInitial = scanner.nextLine();

        System.out.print("Enter unit(kg/gram/lbs) that you want to convert to: ");
        untiFinal = scanner.nextLine();

        if (unitInitial.contains("kg")) {

            if (untiFinal.contains("kg")) {
                System.out.println("You entered the same unit!");
            } else if (untiFinal.contains("lbs")) {
                System.out.println("Your weight is " + weight * 2.2 + "lbs");
            } else if (untiFinal.contains("gram")) {
                System.out.println("Your weight is " + weight * 1000 + "gram");
            }

        } else if (unitInitial.contains("lbs")) {

            if (untiFinal.contains("kg")) {
                System.out.println("Your weight is " + weight * .4536 + "kg");
            } else if (untiFinal.contains("lbs")) {
                System.out.println("You entered the same unit!");
            } else if (untiFinal.contains("gram")) {
                System.out.println("Your weight is " + weight * 4536 + "gram");
            }

        } else if (unitInitial.contains("gram")) {

            if (untiFinal.contains("kg")) {
                System.out.println("Your weight is " + weight * .001 + "kg");
            } else if (untiFinal.contains("lbs")) {
                System.out.println("Your weight is " + weight * .0022 + "lbs");
            } else if (untiFinal.contains("gram")) {
                System.out.println("You entered the same unit!");
            }

        } else {
            System.out.println("Enter a valid unit");
        }

        scanner.close();
    }
}

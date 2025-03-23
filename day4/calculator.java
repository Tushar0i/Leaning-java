import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("In this we are going to make a simple calculator");

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter your first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter you operator(+,-,/,*,^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter your first number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Enter a valid operater");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.println("Answer:"+result);
        }

        scanner.close();
    }
}

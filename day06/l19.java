import java.util.Scanner;

public class l19 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about nested loops");

        Scanner scanner = new Scanner(System.in);

        // nested loop is a loop inside a loop used to create matrix
        for (int a = 0; a <= 2; a++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }

        int row;
        int column;

        System.out.print("Enter the number of rows: ");
        row = scanner.nextInt();

        System.out.print("Enter the number of column: ");
        column = scanner.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= column; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        scanner.close();

    }
}

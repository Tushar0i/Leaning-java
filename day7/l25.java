import java.util.Scanner;

public interface l25 {

    public static void main(String[] args) {
        System.out.println("In this we are going to learn about how we can searching though an array: ");

        Scanner scanner = new Scanner(System.in);

        // int[] numbers = { 1, 3, 2, 5, 31, 21, 9 };
        // int target = 2;
        // boolean isFound = false;

        // for (int i = 0; i < numbers.length; i++) {
        // if (target == numbers[i]) {
        // System.out.println("Element found ar index : "+i);

        // isFound = true;
        // break;
        // }
        // }

        // if (!isFound) {
        // System.out.println("Element not found in the array!");
        // }

        String[] fruits = { "apple", "banana", "oranges" };
        String target ;
        boolean isFound = false;

        System.out.print("Enter the name of fruit that you want to search: ");
        target = scanner.nextLine().toLowerCase();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.println("Element found ar index : " + i);

                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array!");
        }

        scanner.close();
    }
}

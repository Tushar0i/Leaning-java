import java.util.Scanner;

public class l26 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about varargs(variable arguments)");

        // varargs allow a method to accept a varying number of arguments / it means we
        // dont need overloaded method
        // java will pack the argument into an array

        // ...(ellipsis)

        Scanner scanner = new Scanner(System.in);

        int x = 0;
        System.out.print("How many number you have to find average of: ");
        x = scanner.nextInt();
        double[] numbers = new double[x];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter numbers: ");
            numbers[i] = scanner.nextDouble();

        }

        System.out.println(average(numbers));

        scanner.close();

    }

    /*
     * static int add(int... numbers){
     * 
     * // now we are dealing with arrays
     * 
     * System.out.println(numbers);
     * 
     * int sum = 0;
     * for (int i : numbers) {
     * sum+=i;
     * }
     * 
     * // System.out.println("Sum of numbers in arrays is : "+sum);
     * return sum;
     * }
     */

    static double average(double... numbers) {

        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;

        }

        return sum / numbers.length;
    }
}

import java.util.Scanner;

public class l6 {
    public static void main(String[] args) {

        System.out.println("In this we are learning if  statements");
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student(true/false): ");
        isStudent = scanner.nextBoolean();

        /*
         * GROUP 1
         */
        if (name.isEmpty()) {
            System.out.println("You didn't entered your name!");
        } else {
            System.out.println("Hello "+name+"!");
        }



        /*GROUP 2
         * single = is assignment operator
         * and == is comperision operator
         * positioning of the if else statement is also
         * important in here we use >=60 before>=18
         */
        if (age >= 60) {
            System.out.println("You are a senior!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else if (age == 0) {
            System.out.println("You are a baby!");
        } else {
            System.out.println("You are a child!");
        }

        //group 3 
        // if we directly put the variable it will have true value automatically
        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }

        scanner.close();

    }
}

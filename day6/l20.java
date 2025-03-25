public class l20 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about methods");

        // mehtod a block of reusable code that is excutrd when called()

        // in programming we follow DRY principal which means Don't Repeat Yourself
        // methods are not aware of any variable in other method

        // from one method we can send info to other method which is known as arguments

        String name = "Tushar";
        int age = 18;

        happyBirthday(name, age);
        happyBirthday(name, age);

        double sq = square(9);
        double cub = cube(9);

        System.out.printf("Square of 9 is %.2f and Cube is %.2f\n", sq, cub);

        String fullName = getFullName("Spongbob", "Squarepants");
        System.out.println(fullName);

        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        } else {
            System.out.println("You must be 18+ to sign up!");
        }

    }

    // we need a matching set of perameter to reciev arguments
    // name of peramete can be diff from arguments but we maintain consistancy
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you\n");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return Math.pow(number, 3);
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

}

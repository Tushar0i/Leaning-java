public class l3 {
    public static void main(String[] args) {
        System.out.println("This l3 is about variables");

        /*
         * Permitive = simple value stores directly in memory{stack}
         * Permitive data typer few of them are
         * int
         * double
         * char
         * boolean
         * 
         */

        int age = 18;
        int year = 2006;
        int quantity = 1;

        System.out.println("The year is my birth is " + year);

        double price = 99999.99;
        double gpa = 8.38;
        double temprature = -1.4;

        System.out.println("₹" + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);

        // About camaCasing naming convention

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = false;

        System.out.println(isOnline);

        if (isStudent == true) {
            System.out.println("You are a student");

        } else {
            System.out.println("You are not a student");
        }

        /*
         * reference = memory address{stack} that points to the {heap}
         * 
         * few of them are
         * string
         * array
         * object
         */

        String name = "Tushar0i";
        String email = "nothing@email.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello");

        System.out.println("Your gpa is " + gpa);
        System.out.println("Your choice is a "+ color+" "+year+" "+car);
        System.out.println("The price is "+currency+price);
        if(forSale){
            System.out.println("There is a "+ car + "for sale");

        }
        else{
            System.out.println("The "+car + " is not for sale");
        }
    }
}
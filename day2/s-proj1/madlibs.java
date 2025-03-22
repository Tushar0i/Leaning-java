import java.util.Scanner;

public class madlibs {
    public static void main(String[] args) {
        
        System.out.println("In this we are creating mad libs game");
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("\nEnter a adjective (description): ");
        adjective1=scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1=scanner.nextLine();
        System.out.print("Enter a adjective (description): ");
        adjective2=scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1=scanner.nextLine();
        System.out.print("Enter a adjective (description): ");
        adjective3=scanner.nextLine();

        System.out.println("Today I went to "+adjective1+ " zoo.");
        System.out.println("When I was exploring I saw a "+noun1+".");
        System.out.println(noun1+" was "+adjective2+" and "+verb1+ "!");
        System.out.println("I was "+adjective3+"!");

        /*
         * example
         * adj1=lion
         * noun1=lion
         * adj2=stong
         * verb1=roaring
         * adj3=happy
         */

        scanner.close();
    }
}

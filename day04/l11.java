import java.util.Scanner;

public class l11 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn beginner string methods in java");


        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        name = name.trim();//to clear white space

        int length = name.length();
        char letter0 = name.charAt(0);
        char letterLast = name.charAt(length-1);
        //starts from zero then go on

        int index = name.indexOf("r");
        int lastIndex = name.lastIndexOf("r");

        

        System.out.printf("Length of your name = %d\n",length);
        System.out.printf("First letter is %c and last is %c\n",letter0,letterLast);

        name = name.toUpperCase();
        name = name.toLowerCase();

        name = name.replace("u", "o");

        name.isEmpty();//gives a boolean method mostly used in if statement
        name.contains(" ");//give trues if it conataians that
        name.equals("password");// check to see if bot are same or not
        name.equalsIgnoreCase("password");

        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);


        scanner.close();
    }
}

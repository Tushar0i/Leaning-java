import java.util.Scanner;

public class tempconvert {
    public static void main(String[] args) {
        System.out.println("In this we are going to make temperature converter!");

        Scanner scanner = new Scanner(System.in);

        double temp ;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celsius or Faharenhite?(C/F)");
        unit = scanner.next().toUpperCase();

        double newTemp=(unit.equals("C")) ? (temp -32)*5/9 : (temp*5/9)+32;

        unit = (unit.equals("C"))? "F":"C";
        
        System.out.printf("The temperature is %.1f%s",newTemp,unit);




        scanner.close();
    }
}

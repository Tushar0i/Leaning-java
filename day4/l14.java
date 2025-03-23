import java.util.Scanner;
public class l14 {
    public static void main(String[] args) {
        
        System.out.println("In this we are going to learn about enhanced switch");


        Scanner scanner = new Scanner(System.in);

        //Enhanced switch = Areplacement of many if else statements(Java 14 feature)

         String day;

         System.out.print("Enter the day of the week: ");
         day = scanner.nextLine().toLowerCase();


        switch(day){
            case "sunday" -> System.out.println("It is a weekend!");
            // case "monday" -> System.out.println("It is a weekday!");
            // case "tuesday" -> System.out.println("It is a weekday!");
            // case "wednesday" -> System.out.println("It is a weekday!");
            // case "thursday" -> System.out.println("It is a weekday!");
            // case "friday" -> System.out.println("It is a weekday!");
            case "monday","tuesday","wednesday","thuesday","friday" -> System.out.println("It is a weekday!");
            case "saturday" -> System.out.println("It is a weekend!");

            default -> System.out.println(day+" is not a day!");
        }
        

        scanner.close();
    }
}

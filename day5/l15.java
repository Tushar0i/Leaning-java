import java.util.Scanner;


public class l15 {

    public static void main(String[] args) {
        System.out.println("In this we are going to learn about logical operators");

        Scanner scanner = new Scanner(System.in);

        // && = AND
        // || = OR
        // ! = NOT

        int temp = -20;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is sunny outside");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is cloudy outside");
        } else if (temp > 30 || temp < 0 ){
            System.out.println("The weather is bad outside!");
        }

        // username must be b/w 4 to 12 char
        // username must not have spaces and underscores

        String username;
        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length()<4 || username.length()>12){
            System.out.println("Username must be between 4 to 12 characters !");
        }else if(username.contains(" ")|| username.contains("_")){
System.out.println("Usename must not contains spaces and undersocre !");
        } else{
            System.out.printf("Welcome %s!",username);
        }


        scanner.close();
    }
}
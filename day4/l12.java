import java.util.Scanner;

public class l12 {
    public static void main(String[] args) {
        System.out.println("IN this we are going to learn about subStrings");

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;
        int atSign;

        System.out.print("Enter your email address: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            atSign = email.indexOf("@");
            username = email.substring(0, atSign);
            // domain = email.substring(atSign+1,length); can also be written as
            domain = email.substring(atSign + 1);
            System.out.printf("You username is %s and the domain you used is %s", username, domain);

        } else {
            System.out.println("Enter a valid email address");
        }
        

        scanner.close();
    }
}

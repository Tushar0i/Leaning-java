import java.util.Scanner;
public class l17 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("In this we are going to learn about for loops");


        Scanner scanner = new Scanner(System.in);

        //  for loop = execute same code a Certain amount of times 

        for(int i=1;i<=10;i++){

            System.out.println("Apple"+i);
        }

        for(int a = 10 ; a>0 ; a--){
            System.out.println(a);

            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR");

        scanner.close();
    }
}

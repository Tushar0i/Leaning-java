
import java.util.Scanner;


public class l24 {
    public static void main(String[] args) {
        

        System.out.println("In this we are going to learn about how to get use input in array: ");

        // String[] foods = {};  this have zero length


        //Compiler needs to konw that how many elements are there in string

        String[] foods = new String[5];

        foods[0]= "Pav bhaji";
        foods[1]= "Dam aalu";
        foods[2]= "Aalu jeera";
        foods[3]= "Chole";
        foods[4]= "Raita";


        for (String streetFood : foods) {
            System.out.println(streetFood);
        }

        Scanner scanner = new Scanner(System.in);

        int x;
        System.out.print("Enter the type of fruits you want to order: ");
        x = scanner.nextInt();
        scanner.nextLine();


        String[] fruits = new String[x];

        for( int i = 0 ; i < fruits.length; i++){

            System.out.print("Enter fruit name: ");
            fruits[i]= scanner.nextLine();

        }

        for (String string : fruits) {

            System.out.println(string);
        }





        scanner.close();

    }
}

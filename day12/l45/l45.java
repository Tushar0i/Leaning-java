import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class l45 {

    public static void main(String[] args) {
        System.out.println("In this we are going to lear about Arraylists!!");

        // ArrayList = resizeable array that stores objects (autoboxing) .
        //Arrays are fixed in size, but ArrayLists can changes.

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Oranges");
        fruits.add("Coconut");

        // fruits.remove(3);
        // fruits.set(0,"Pineapple");
        
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());


        Collections.sort(fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }



        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");

        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.printf("Enter food no %d: ",i);
           
            list.add(scanner.nextLine());
        }

        System.out.println(list);


        scanner.close();
    }
    
} 
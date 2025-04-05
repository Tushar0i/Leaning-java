import java.util.Scanner;

public class l40{
    public static void main(String[] args){
        System.out.println("In this we are going to learn about runtime polymorphism!!");
        Scanner scanner = new Scanner(System.in);
        
        /*
         * RUNTIME POLYMORPHISM = When the method that gets extended is decided 
         * at runtime based on the actual type of the object
         * also knows as dynamic polymorphism
         */



        Animal animal ;

        System.out.print("Would you like a dog or a cat(1 for dog and 2 for cat): ");
        int choice  = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if( choice == 2){
            animal = new Cat();
            animal.speak();
        }else{
            System.out.println("In valid choice!!");
        }

        

    }
}
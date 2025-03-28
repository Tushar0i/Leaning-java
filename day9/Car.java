public class Car{
    String make = "Tata" ;
    String model = "Nano" ;
    String color = "Yellow" ;
    int year = 2009 ;
    double price = 2499.99 ;
    boolean isRunning = false ;


    void start(){
        isRunning = true;
        System.out.println("You started the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stopped the engine");
    }

    void drive(){
        System.out.println("You drive the "+model);
    }

    void brake(){
        System.out.println("You break the "+model);
    }
}
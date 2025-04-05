public class l39{
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about polymorphism!!");

        // Polymorphism  poly mean many and morph mean shape 
        // Object can identify as other objects.
        // Object can be treated as objects of a common superclass.  

        // we can also use interface insted of abstract but we have to use an access modiefer like public 

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();


        

        Vehicle[] vehicles = {car,bike,boat};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

    }
}
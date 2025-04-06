public class l43{
    public static void main (String[] args){
        System.out.println("In this we are going to learn about Composition in java!!");



        // Composition == Represents a (part-of) relationship between objects.
        // For example , an Engine is 'Part of'  a car.
        // Allows complex objects to be contructed for smaller objects.


        Car car  =new Car("Tata curvv", 2024,"V8" );

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);


        car.start();

    }
}
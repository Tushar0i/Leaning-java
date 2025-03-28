public class l28 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about oop: ");

        // object = an entity that holds data (attributes like you height, weight, age,etc)
        // and can perform action (methods like sleep,eat,etc)
        // it is a reference data type

        Car car = new Car();


        System.out.println(car); // this will give a memory address 
        System.out.println(car.color);// do operator is used to access things within the object

        car.isRunning = true;


        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        


        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        
        car.start();
        System.out.println(car.isRunning);


        car.drive();


        car.brake();

        Car car1 = new Car();
        Car car2 = new Car();


        System.out.println(car1.make+" "+ car1.model);
        System.out.println(car2.make+" "+ car2.model);

        // car1 and car 2 are different but have same attributes;

    }
}

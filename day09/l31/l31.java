public class l31 {

    public static void main(String[] args) {
        
        System.out.println("In this we are got to learn about how to create array of object: ");

        // Car car1 = new Car("Mustang", "Red");
        // Car car2 = new Car("Rolls-Royce", "Yellow");
        // Car car3 = new Car("Range Rover", "Black");

        // Car[] cars = {car1,car2,car3};

        Car[] cars = {new Car("Mustang", "Red"),
        new Car("Rolls-Royce", "Yellow"),
        new Car("Range Rover", "Black")};


        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        for (Car car : cars) {
            car.color = "black";
        }

        for (Car car : cars) {
            car.drive();
        }
        
    }


}
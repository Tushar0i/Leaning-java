public class l36{
    public static void main(String[] args){

        /*
         *  .toString() = method inherited from the Object class.
         * Used to return a string representation of an object 
         * By default , it returns a hash code as a unoque identifier.
         * it can be overidden to provide meaningful details.
         */

         Car car = new Car("Ford", "Mustang", 2025, "Blue");
         Car car2 = new Car("Tata", "Curvv.ev", 2025, "Black");


        // System.out.println(car); without toString we will get a hash code

        //  System.out.printf("%s %d %s %s",car.color,car.year,car.make,car.model);

        System.out.println(car);
        System.out.println(car2);

    }
}
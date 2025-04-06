public class l41{

    public static void main(String[] args){

        System.out.println("In this we are going to learn about getters and setters method!!");

        // This help protect object data and add rules for accessing or modifying them.
        
        
        // getters - method that make a filed readable.


        Car car = new Car("Tesla Model 3", "White", 50000);


        // car.model = "Tata" 

        // System.out.printf("%s %s %d",car.color,car.model,car.price); we cant acess them dorectly because of private

        System.out.printf("%s %s %s\n",car.getColor(),car.getModel(),car.getPrice()); 
        
        
        // setters - method that make a filed writeable.
        
        
        //  car.color = "Blue";
        //  car.price = 46000;



        // car.setModel("Tesla Model s")
        car.setColor("Blue");
        car.setPrice(46000); 

        System.out.printf("%s %s %s\n",car.getColor(),car.getModel(),car.getPrice()); 



        car.setPrice(-100); 

        System.out.printf("%s %s %s\n",car.getColor(),car.getModel(),car.getPrice()); 



    }

}
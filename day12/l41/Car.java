public class Car {
    
    private final String model;  //if we add private in front of them the are not accessable directly // We can also add final for extra layer of security
    private String color;
    private int price;


     

    Car(String model,String color,int price){

        this.model = model;
        this.color = color;
        this.price = price;
    }



    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$" + this.price;
    }

    // void setModel(String model){
    //     this.model = model;
    // } but we don,t want to  be writable


    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){

        if (price<0) {
            System.out.println("Price of car can't be less then zero");
        } else {
            
            this.price = price;
        }

    }
}

public class l33{

    public static void main(String[] args){

        System.out.println( "In this we are going to learn about inharitance in java!!");

        // Inheritance = One class in harits the attributes and methods from other class.

        // multi level inheritance
        
        // Child <- Parent <- Grandparent
        // this is very useful for so many classes and we have to make the changs in all the classes


        Dog dog = new Dog();
        Cat cat = new Cat();

    System.out.println(dog.isAlive);
    System.out.println(cat.isAlive);

        
    dog.eat();
    cat.eat();


    System.out.println(dog.lives);
    System.out.println(cat.lives);


    dog.speak();
    cat.speak();


    Plant plant = new Plant();

    System.out.println(plant.isAlive);

    plant.photosynthesis();
    }    
    
}
public class l35 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about method overriding");

// Method overriding = When a subclass provides its own implementation of a method that is already defined.
// Allows for code reusabality and give specific impliations.


        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}
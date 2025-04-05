public class l38 {
    public static void main(String[] args) {

        System.out.println("In this we are going to learn about Interface in java!!");

        // Interface = A blueprint for a class that specifies a set of abstract ethods
        // that implementing classes must define
        // Supports multiple inheratance like behavior.

        Rabbit rabbit = new Rabbit();

        Hawk hawk = new Hawk();

        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}
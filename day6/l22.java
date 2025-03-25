public class l22 {

    static int z = 5; // this is a class variable
    // java priyor local variable variable first then class

    public static void main(String[] args) {
        System.out.println("In this we are going to learn about variable scope!");

        int z = 3;// it is a local variable

        System.out.println(z);
        doSomething();
    }

    static void doSomething() {
        int y = 4;// Local varible

        System.out.println(y);
        System.out.println(z);
    }
}

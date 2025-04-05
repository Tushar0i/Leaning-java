public class l37{
    public static void main (String[] args){
        System.out.println("IN this we are going to learn about abstract keyword !!");

        // abstract = Used to define abstract classes and methods.
        //   abstract is the process of hiding implementation details and showing only the essential feature;
        // Abstract classes CAN'T be instantiated directly
        // Can contain abstract methods(which must be implemented)
        //Can contain concrete method (which are inherited)


        // Shape shape = new Shape() ; cn can't make shape object but we can make circle

        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(3.0,5.0);
        Rectangle rectangle = new Rectangle(5.5,8.8);


        circle.display();
        triangle.display();
        rectangle.display();


        System.out.println(circle.area());
     
        System.out.println(triangle.area());

        System.out.println(rectangle.area());
    }
}
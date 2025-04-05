public class Rectangle extends Shape{
    
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.breadth = breadth;
        this.length = length;

    }

    @Override
    double area(){
        return 2*(length + breadth);
    }
}

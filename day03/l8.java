import java.util.Scanner;
public class l8{

    public static void main(String[] args){
        System.out.println("In this we are going to learn about math class");

        Scanner scanner = new Scanner(System.in);

        System.out.println(Math.PI);
        System.out.println(Math.E);


        double result;

        result = Math.pow(9, 9);
        result = Math.abs(-1979);
        result = Math.sqrt(9);
        result = Math.round(9099.2879328);
        result = Math.ceil(9099.001);
        result = Math.floor(89.9990);
        result = Math.max(10,99);
        result = Math.min(-29,-99);

        System.out.println(result);

        // finding the length of th hypo of right angled triangle

        double a;
        double b;
        double c;

        System.out.print("Enter the lenght of  perpendicular of triangle: ");
        a = scanner.nextDouble();
        System.out.print("Enter the lenght of  base of triangle: ");
        b = scanner.nextDouble();

        // c = Math.sqrt(a*a + b*b);
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Length of the hypo is "+c+"units");

        // finding the area , volume and circumference of the circle/sphear if radii is given

        double radii;
        double circumference;
        double area;
        double volume;


        System.out.print("Enter the radius length: ");
        radii = scanner.nextDouble();

        circumference = 2*Math.PI*radii;
        area = Math.PI*Math.pow(radii, 2);
        volume = (4.0/3.0)*Math.PI*Math.pow(radii, 3);

        System.out.println("Circumference = "+Math.round(circumference)+"units");
        System.out.println("Area = "+Math.round(area)+"sq.units");
        System.out.println("Volume = "+Math.round(volume)+"cube.units");





        scanner.close();
    }
}

public class l21 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about overloaded methods ");

        //  overloaded menthods = methods that shares the samename ,but different perameters , signatue = name + paremeter 

        System.out.println(add(1,2,3));

        System.out.println(customPizza("thincrust","cheese burst","olive"));


    }


    static double add(double a, double b){
        return a+b ;
    }

    static double add(double a, double b,double c){
        return a+b+c ;
    }
    static double add(double a, double b,double c,double d){
        return a+b+c+d ;
    }

    static String customPizza(String bread){

        return bread+" pizza";
    }
    static String customPizza(String bread,String cheese){

        return cheese+" "+bread+" pizza";
    }
    static String customPizza(String bread,String cheese , String topping){

        return topping+" "+cheese+" "+bread+" pizza";
    }

}

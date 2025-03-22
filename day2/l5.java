public class l5 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about Arithmetic Operation");


        int x = 10;
        int y = 7;
        int z;

        /*
         * z = x + y;
         * z = x - y;
         * z = x * y;
         * z = x / y;
         * z = x % y; give remainder agter division
         */

         System.out.println(x%y);

         // Augmented Assignment Operators

         // x += y; this is same as x = x + y

        //  x += y;
        //  x -= y;
        //  x *= y;
        //  x /= y;
        //  x %= y;
         
        // Incriment and Decriment Operators

        int a = 1;
        int b;

        a++; // this is same as x+=1 or x=x+1 for incriment
        a--; // decriment

        System.out.println(a);

        // Order of Operation [B-E-M-D-A-S] bracket exponent multi divi add and sun
        double result = 3 + 5 * ( 9 - 4 ) / 9git ;
        System.out.println(result);

    }
}

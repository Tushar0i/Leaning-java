public class l9 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about printf() statement");

        //printf() is a method used to formate output
        // %(flags)(width)(.precision)(specifier -charactor)

        String name = "Tushar";
        char firstLetter = 'T';
        int age = 18;
        double height = 60.5;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name starts with  %c\n",firstLetter);
        System.out.printf("You are %d years old.\n",age);
        System.out.printf("You are %f inches tall \n",height);
        System.out.printf("Employed: %b\n",isEmployed);

        System.out.printf("%s is %d years old\n",name,age);

        double price1 = 900000.99;
        double price2 = 100000.15;
        double price3 = -512436.09;

        // It automatically round of the digit

        //Flags
        /*
         * + = output a plus
         * , = comma grouping separator
         * ( = negative number are enclosed in ()
         * space = display a minus if negative,space if positive
         */
        System.out.printf("%+.1f\n",price1);
        System.out.printf("%+.1f\n",price2);
        System.out.printf("%+.1f\n",price3);

        System.out.printf("%,.1f\n",price1);
        System.out.printf("%,.1f\n",price2);
        System.out.printf("%,.1f\n",price3);

        System.out.printf("%(.1f\n",price1);
        System.out.printf("%(.1f\n",price2);
        System.out.printf("%(.1f\n",price3);

        System.out.printf("% .1f\n",price1);
        System.out.printf("% .1f\n",price2);
        System.out.printf("% .1f\n",price3);


        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id2 = 90;
        int id3 = 100;
        int id4 = 5436;
        int id1 = 6;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);

    }
}

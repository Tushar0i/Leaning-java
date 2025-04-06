public class l44 {

    public static void main(String[] args) {
        System.out.println("In this we are going to learn about Wrapper classes!");

        // Wrapper classes = allow primitive values(int ,char,double,boolean)
        // to be used as object ."Wrap them in an object"
        // generall , don't wrap permitive unless you need an object.
        // allow use of collections framework and static utility methods,

        // Integer a = new Integer(1253);

        // Autoboxing

        Integer a = 1253;
        Double b = 1253.90;
        Character c = 'S';
        Boolean d = true;
        String e = "Apple";

        // unboxing
        int p = a;
        double q = b;
        char r = c;
        boolean s = d;
        String t = e;

        System.out.println(t);
        System.out.println(s);
        System.out.println(r);
        System.out.println(p);
        System.out.println(q);


        // toString

        String l = Integer.toString(30);
        String m = Double.toString(1.22);
        String n = Character.toString('(');
        String o = Boolean .toString(false);


        String x = l+m+n+o;

        System.out.println(x);



        // parsing

        int f = Integer.parseInt("123");
        double g = Double.parseDouble("23.004");
        // char dont have parse insted we can use 
        char h = "Oranges".charAt(3);
        boolean i = Boolean.parseBoolean("false");

        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        //misc methods

        char letter = 'P';

        System.out.println(Character.isLetter(letter));
        // this returns a boolean

        System.out.println(Character.isUpperCase(letter));

        
    }
}
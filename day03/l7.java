import java.util.Random;
public class l7 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about random345064530 module");

        Random random = new Random();

        int number1;
        int number2;
        int number3;
        // we can add range default range -bill to + bill last bound is not included keep that in mind

        number1 = random.nextInt(1,7);
        number2 = random.nextInt(1,7);
        number3 = random.nextInt(1,7);

        System.out.println("Rolling 3 dices");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


        Double number4;
        number4 = random.nextDouble();
        
        System.out.println(number4);

        Boolean isHead;
        isHead = random.nextBoolean();

        if (isHead) {
            System.out.println("HEADs");
        } else {
            System.out.println("TAILs");
        }
        


    }
}

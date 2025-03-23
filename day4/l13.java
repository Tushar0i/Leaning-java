public class l13 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about TERNARY operator!");

        // It is a simplar version of if else statement for 2 things
        //variable = (condition) ? ifTrue : ifFalse ;

         int score = 100 ;

         if(score>=33){

            System.out.println("You pass this grade");
        }
         else{
            System.out.println("Your can try again after 3 months!");
         }

         // this can also be written as 

         String passOrAgain = (score>=33) ? "Pass":"Try again";

         System.out.println(passOrAgain);

         // we can check that the number is even or odd

         int number = 7;

         String evenOrOdd = (number % 2 == 0) ? "EVEN":"ODD";

         System.out.println(evenOrOdd);

         int hours = 13;
         
         String timeOfDay = (hours < 12) ? "A.M.":"P.M.";

         System.out.println(timeOfDay);

         int income = 6000000 ;

         double taxRate = (income>1200000)? 5 : 0;

         System.out.println(taxRate);

    }
}

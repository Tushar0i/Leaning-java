import java.util.Scanner;

public class bankingProgram {

    static Scanner scanner = new Scanner(System.in);
    // making the scanner class variable so that we can use it in both
    public static void main(String[] args) {
        System.out.println("In this we are going to creata a simple banking program!");


        /*
         * declear variables
         * display menu
         * get and process user choice
         * create methods
         * showBalance()
         * deposite()
         * withdraw()
         * exit message
         */

         double balance = 5700.50;
         boolean isRunning = true;
         int choice = 0;

         while (isRunning) {
            
             System.out.println("-------------------------------");
             System.out.println("-------------------------------");
             
             
             System.out.println("1->> Show balance");
             System.out.println("2->> Deposit");
             System.out.println("3->> Withdraw");
             System.out.println("4->> Exit Men");
             System.out.println("-------------------------------");
             System.out.println("-------------------------------");
             
             System.out.print("Enter your choice to  do the following: ");
             choice = scanner.nextInt();
             
             System.out.println("-------------------------------");
             
             
             switch(choice){
                 case 1 -> showBalance(balance);
                 case 2 -> balance+=deposite();
                 case 3 -> balance-=withdraw(balance);
                 case 4 -> isRunning = false;
                 default -> System.out.println("Invalid choice!");
                }
            }

         

            System.out.println("Thank you for using our services! Have a nice day!");


         scanner.close();
    }
    static void showBalance(double balance){

        System.out.printf("$%.2f\n",balance);
    }


    static  double deposite(){

       
        double amount ;
        System.out.print("Enter an amount to deposited: ");
        amount = scanner.nextDouble();
        if (amount<0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            
            return amount;
        }

        
    }

    static  double withdraw(double balance){

       
        double amount ;
        System.out.print("Enter an amount to withdwawn: ");
        amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
        } else if (amount>balance) {
            System.out.println("You don't have that much balance!");
            return 0;
        }
        else{
            
            return amount;
        }


    }
    
}

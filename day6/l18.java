public class l18 {

    public static void main (String[] args){

        System.out.println("In this we are going to learn about break and continue in loop");


        /*
         * break = break out of a loop(STOP the loop at that condition)
         * 
         * continue = skip current iteration of loop (SKIP when condition is true)
         */
        for(int i = 1 ; i<=10; i++){

            if (i==3) {
                continue;
            }
            if (i==6) {
                break;
            }
            System.out.print(i+" ");
        }



    }
}
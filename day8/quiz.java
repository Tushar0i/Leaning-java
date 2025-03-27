import java.util.Scanner;

public class quiz {

    public static void main(String[] args) {
        System.out.println("In this we are going to make a quiz project!  ");
        Scanner scanner = new Scanner(System.in);

        /*
         * 1question array
         * 2option 2d array
         * 3 declearing variables
         * 4 welcome message
         * 5 question (loop)
         * option
         * get guess from user
         * check our guess
         * 6 display final score
         */

        String[] questions = { "What is the capital of India?",
                "Which planet is known as the Red Planet?",
                "What is H^2O commonly known as?",
                "Who invented the light bulb?",
                "How many continents are there in the world?" };

        String[][] options = { { "1) Mumbai\n" + //
                "2) Kolkata\n" + //
                "3) New Delhi\n" + //
                "4) Chennai\n" },
                { "1) Venus\n" + //
                        "2) Mars\n" + //
                        "3) Jupiter\n" + //
                        "4) Saturn\n" },
                { "1) Oxygen\n" + //
                        "2) Water\n" + //
                        "3) Hydrogen\n" + //
                        "4) Salt\n" },
                { "1) Nikola Tesla\n" + //
                        "2) Albert Einstein\n" + //
                        "3) Thomas Edison\n" + //
                        "4) Isaac Newton\n" },
                { "1) 5\n" + //
                        "2) 6\n" + //
                        "3) 7\n" + //
                        "4) 8\n" } };

        int[] answer = { 3, 2, 2, 3, 3 };
        int score = 0;
        int guess;

        System.out.println("-------------------------------");
        System.out.println("Welcome to the java quiz game!");
        System.out.println("-------------------------------");
        

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            

            for ( String option : options[i]) {
                System.out.println(option);

            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answer[i]) {

                System.out.println("--------");
                System.out.println("Correct!");
                System.out.println("--------");
                score++;
            } else {
                System.out.println("------");
                System.out.println("Wrong!");
                System.out.println("------");
            }


        }



        System.out.printf("You final score is : %d out of %d\n",score,questions.length);

        switch(score){
            case 0 -> System.out.println("No worries! Every expert was once a beginner. Keep learning and try again!");
            case 1 -> System.out.println("Good start! Keep going, you'll get better!");
            case 2 -> System.out.println("Nice try! You're getting there!");
            case 3 -> System.out.println("Great job! You're learning well!");
            case 4 -> System.out.println("Excellent! Just one step away from perfection!");
            case 5 -> System.out.println("Outstanding! You're a genius!");

            default -> System.out.println("Nothing!");
        }

        scanner.close();
    }

}
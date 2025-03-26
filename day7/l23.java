import java.util.Arrays;

public class l23 {
    

    public static void main(String[] args) {
        System.out.println("In this we are going to learn about arrays!");

        //Arrays a collection of values of the same data type 
        //variable that can store more than 1 value

        String fruit =  "apple";

        System.out.println(fruit);

        // array is a reference data type

        String[] fruits ={"Apple","Bananas","Oranges","Grapes","Mango"};

        fruits[1]="Pineapple";

        System.out.println(fruits[1]);
        //[in bracket we write index number which starts with 0 ]

        int numOfFruits = fruits.length;
        // it will give the number of elements in array

        System.out.println(numOfFruits);

        for(int i = 0 ; i < fruits.length ; i++){

            System.out.print(fruits[i]+ " ");
        }

        Arrays.sort(fruits);
        //this sort arrays alphbitically

        // ehnance for loop/ for each loop 

        for (String fal : fruits) {
            System.out.println(fal);

        }
        Arrays.fill(fruits,"Pineapple");
        //this sort arrays alphbitically

        // ehnance for loop/ for each loop 

        for (String fals : fruits) {
            System.out.println(fals);
        }

        





        }

   }

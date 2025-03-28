public class l30 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about overloaded constructors: ");

        // overloades constructors    allows a class to have multipal constructions with different perameter lists .
        // Enable objects to be initialized in various ways.


        User user1 = new User("Patrick");
        User user2 = new User("Ronald","ronald.someth.ing");
        User user3 = new User("Silly","silly.nothing.com",33);


        User defaultUser = new User();

        System.out.println(defaultUser.username);
        System.out.println(defaultUser.email);
        System.out.println(defaultUser.age);
        
        System.out.println(" ");
        
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
       
        System.out.println(" ");
      
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(" ");
        
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);


    }
}

public class Friend {
    
    static int noOfFriend;
    String name;
//  static  = make the variable or method belong to the class no the oblect specific;


    Friend(String name){
        this.name = name;

        noOfFriend++;
    }

    static void showNoOfFriends(){
 System.out.println("You have "+noOfFriend+" total friends!!");// we dont have to use this for static
    }
}

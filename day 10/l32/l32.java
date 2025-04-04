public class l32{

    public static void main(String[] args) {
        System.out.println("In this we are going to learn about the static keyword: ");

        Friend friend1 = new Friend("Harry");
        Friend friend2 = new Friend("Lora");
        Friend friend3 = new Friend("John");
        Friend friend4 = new Friend("Petrick");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);
        // System.out.println(friend1.noOfFriend);
        System.out.println(Friend.noOfFriend);


        Friend.showNoOfFriends();
      

        
    }
}
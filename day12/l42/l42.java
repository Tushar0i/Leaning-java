public class l42{
    public static void main (String[] args){
        System.out.println("In this we are going to learn about aggregation!!");

        //Aggregation == Represents a "has-a" relationship between objects.
        //One object cantains another object as part of its structure,
        // but the contained object/s an exist independently.

        Book book1 = new Book("School of Life", 298);
        Book book2 = new Book("The Two Tower", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books ={book1,book2,book3};

        // for (Book book : books) {
            
        //     System.out.println(book.displayInfo());
        // }

        Library library = new Library("The Nation Library of India", 1836, books);

        library.displayInfo();

    }
}
public class l29 {
    
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about  constructors");


        //Constructore == a special method to intialize objects ,we can pass arguments to a constructor and set up its initial value


        Student student1 = new Student("Kelly",21,8.3);
        // we can pass arguments in this
        Student student2 = new Student("Patrick",23,7.9);

        Student student3 = new Student("Arish", 19, 8.7);


        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();
        
        
        
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();
        
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();
        

    }
}

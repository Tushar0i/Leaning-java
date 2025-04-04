public class l34{
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about super in java!!");

        // super refers to the parent class (subclass <- superclass)

        // used in constructors and method overriding calls the parent constructor to initialize attributes

        Person person = new Person("Mohan", "Yadav");


        person.showName();


        Student student = new Student("Golu", "Yadav", 7.99);

        student.showName();
        student.showGpa();

        Employee employee = new Employee("Tom", "Riddle", 9999);

        employee.showName();
        employee.showSalary();
    }
}
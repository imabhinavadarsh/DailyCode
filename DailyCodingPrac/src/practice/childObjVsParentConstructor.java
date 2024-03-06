package practice;

// Main class
public class childObjVsParentConstructor {

    // Main method
    public static void main(String[] args) {
        // Creating an instance of Students class
        Students s = new Students("Abhinav", 22, 101, 80);
        
        // Printing details of the student
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Roll No: " + s.rollno);
        System.out.println("Marks: " + s.marks);
    }

    // Static nested class Person
    static class Person {
        String name; // Instance variable to store name
        int age;     // Instance variable to store age

        // Constructor for Person class
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // Static nested class Students extending Person
    static class Students extends Person {
        int rollno; // Instance variable to store roll number
        int marks;  // Instance variable to store marks

        // Constructor for Students class
        Students(String name, int age, int rollno, int marks) {
            // Calling constructor of parent class (Person)
            super(name, age);
            this.rollno = rollno; // Assigning roll number
            this.marks = marks;   // Assigning marks
        }
    }
}

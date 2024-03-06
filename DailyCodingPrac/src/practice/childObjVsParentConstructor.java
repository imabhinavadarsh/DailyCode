package practice;

public class childObjVsParentConstructor {

    public static void main(String[] args) {
        Students s = new Students("Abhinav", 22, 101, 80);
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Roll No: " + s.rollno);
        System.out.println("Marks: " + s.marks);
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Students extends Person {
        int rollno;
        int marks;

        Students(String name, int age, int rollno, int marks) {
            super(name, age);
            this.rollno = rollno;
            this.marks = marks;
        }
    }
}

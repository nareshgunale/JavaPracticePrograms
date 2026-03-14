package Constructor;

public class Student {
    String name;
    int rollNo;
    int marks;

    Student() {
        name = "Sumit";
        rollNo = 21;
        marks = 90;


    }

    public void display() {
        System.out.println("Student Details :");
        System.out.println("Name- " + name);
        System.out.println("RollNo- " + rollNo);
        System.out.println("Marks- " + marks);

    }

    public static void main(String[] args) {
        Student s=new Student();
        s.display();

    }
}

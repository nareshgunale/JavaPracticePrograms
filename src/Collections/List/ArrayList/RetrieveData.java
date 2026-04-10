package Collections.List.ArrayList;

import java.util.ArrayList;

class Student {
    int id;
    String name;
    String address;
    public Student(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address=address;

    }
}
 class AddingStudentData{
     ArrayList<Student> StudentData()
     {
         Student s1 = new Student(1, "Sumit", "Pune");
         Student s2 = new Student(2, "Sudarshan", "Nanded");
         Student s3 = new Student(3, "Nikhil", "Kolhapur");
         ArrayList<Student> studentList = new ArrayList<Student>();
         studentList.add(s1);
         studentList.add(s2);
         studentList.add(s3);
         return studentList;
     }




}
public class RetrieveData{
    public static void main(String[] args) {
        AddingStudentData d = new AddingStudentData();
        ArrayList<Student> l1 = d.StudentData();
        for(Student st:l1){
            System.out.println("Student ID: "+st.id);
            System.out.println("Student Name: "+st.name);
            System.out.println("Student Address: "+st.address);
            System.out.println();
        }

    }

}

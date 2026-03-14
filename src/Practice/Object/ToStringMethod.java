package Practice.Object;
class Student{
    private String name;
     private int rollNo;
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String toString(){
        return "My Name is "+name+" And Roll No "+rollNo;
    }
}
public class ToStringMethod {
    public static void main(String[] args) {

        Student s1 = new Student("Durga",20);
        Student s2 = new Student("Sumit",21);
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
    }
}

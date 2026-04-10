package String;
final class Student{
    private final int id;
    private final String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Student changeName(String newName){
        return new Student(this.id,newName);
    }
}
public class CustomImmutable {
    public static void main(String[] args) {
        Student s = new Student(1,"Sumit");
        Student s1 = s;
        System.out.println(s==s1);

        System.out.println(s.getId());
        System.out.println(s.getName());
        Student s2=  s.changeName("Sudarshan");;

        System.out.println(s==s2);
        System.out.println(s2.getName());
        System.out.println(s.getName());
        System.out.println(s2.getId());

    }
}

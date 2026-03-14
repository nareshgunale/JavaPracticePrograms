package Practice.Constructor;
class Address{
    String city;
    Address(String city){
        this.city=city;
    }
    @Override
    public String toString() {
        return city;
    }

}
public class Student {
    String name;
    Address address;
    Student(String name,Address address){
        this.name=name;
        this.address=address;
    }
    Student(Student s){
        this.name=s.name;
        this.address=s.address;
    }
    void display(){
        System.out.println(name+"-"+address);
    }

    public static void main(String[] args) {
        Address a1=new Address("Pune");
        Student s1=new Student("Sumit",a1);
        Student s2=new Student(s1);
        s1.display();
        s2.display();

        System.out.println("After changing");
        s2.address.city="Udgir";
        s1.display();
        s2.display();

    }
}

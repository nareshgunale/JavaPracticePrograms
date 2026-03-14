package Constructor;
class Person1{
    Person1( String name){
        System.out.println("Person Name "+name);
    }

}
class Employee1 extends Person1{
    Employee1(String name,int id){
        super(name);
        System.out.println("Employee Id: "+ id);
    }
}
public class Manager extends Employee1 {
    Manager(String name,int id,double salary){
        super(name,id);
        System.out.println("Salary :"+salary);
    }
    public static void main(String[] args){
        Manager m= new Manager("Sumit",1,800000);
    }
}

package Constructor;
class Person{
    Person(){
        System.out.println("Parent Constructor");
    }
}


public class Employee extends Person{

    Employee(){
        // super(); If parent have no argument constructor then JVM provides if we don't add .

        System.out.println("Child Constructor");
       // super(); must be at first line otherwise Compile time error.
    }

    public static void main(String[] args){
        Employee E = new Employee();
    }
}

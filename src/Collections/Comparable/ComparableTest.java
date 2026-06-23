package Collections.Comparable;
import java.util.*;
class Employee implements Comparable<Employee>{
    private int id ;
    private String name;
    private Double salary;

    public Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Double getSalary(){
        return salary;
    }
    @Override
    public int compareTo(Employee e){
        return Integer.compare(this.id,e.id);
    }
    @Override
    public String toString(){
        return "Employee ID: "+id+" ,Employee Name: "+name+" ,Salary: "+salary;
    }
}
public class ComparableTest {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(103,"Sumit",9000000));
        emp.add(new Employee(102,"Sudarshan",8000000));
        emp.add(new Employee(101,"Avishkar",7000000));
        Collections.sort(emp);
        System.out.println(emp);


    }

}

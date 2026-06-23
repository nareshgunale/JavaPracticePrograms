package Collections.Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Employeee{
    private int id;
    private String name;
    private Double salary;

    public Employeee(int id,String name,Double salary){
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
    public String toString(){
        return id+" "+name+" " + salary + " ";
    }
}
public class ComparatorTest {

    public static void main(String[] args) {
        List<Employeee> emp = new ArrayList<>();

        emp.add(new Employeee(3,"Shreash",300000.0));
        emp.add(new Employeee(2,"Sumit",4000000.0));
        emp.add(new Employeee(1,"Sidhesh",2000000.0));
        Collections.sort(emp,new NameComparator());
        System.out.println(emp);
        Collections.sort(emp,new SalaryComparator());
        System.out.println(emp);

        }

    }


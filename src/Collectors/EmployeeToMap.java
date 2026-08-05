package Collectors;



import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeToMap {
    private int id;
    private String name;
    private String department;
    private double salary;

    public EmployeeToMap(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeToMap{" +
                "id=" + id +
                ", name='" + name
                ;
    }

    public static void main(String[] args) {
        List<EmployeeToMap> employees = List.of(new EmployeeToMap(101,"Rahul","IT",50000),
                new EmployeeToMap(102,"Amit","HR",60000),

                new EmployeeToMap(103,"Nehal","Sales",70000),

                new EmployeeToMap(104,"Piyush","IT",55000) );
        Map<Integer,String> map = employees.stream().collect(Collectors.toMap(EmployeeToMap::getId,EmployeeToMap::getName));
        System.out.println("Id and Name: "+map);
        Map<String,Double> map1 = employees.stream().collect(Collectors.toMap(EmployeeToMap::getName,EmployeeToMap::getSalary));
        System.out.println("Id and Name: "+map1);

    }
}

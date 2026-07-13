package Java8.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Sumit",101,900000.0));
        list.add(new Employee("Sudarshan",102,800000.0));
        list.add(new Employee("Nikhil",103,700000.0));

        Collections.sort(list,(e1,e2) -> e2.getId().compareTo(e1.getId()));
        System.out.println(list);

        Collections.sort(list,(e1,e2)->e2.getName().compareTo(e1.getName()));
        System.out.println(list);

        Collections.sort(list,(e1,e2)->e1.getSalary().compareTo(e1.getSalary()));
        System.out.println(list);



    }
}
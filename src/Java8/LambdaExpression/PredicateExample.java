package Java8.LambdaExpression;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p = n -> n%2==0;
        System.out.println(p.test(10));
        System.out.println(p.test(15));

        Predicate<Integer> p1 = n -> n>0;
        System.out.println(p1.test(0));
        System.out.println(p1.test(1));

        Predicate <String> p2 = s -> s.length() > 5;
        System.out.println(p2.test("Sudarshan"));
        System.out.println(p2.test("Sumit"));

        Predicate<String> p3 = String:: isEmpty;
        System.out.println(p3.test(""));
        System.out.println(p3.test("ABC"));
        Employee emp = new Employee("Sumit",101,100000.0);
        Predicate<Employee> predicate = pre -> emp.getSalary()>50000.0;
        System.out.println(predicate.test(emp));
    }
}

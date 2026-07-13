package Java8.LambdaExpression;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String,Integer> function =String :: length;
        System.out.println("String length: "+function.apply("Hibernate"));

        Function<Integer,Integer> function1 = i ->i*i;
        System.out.println("Square of a Given Number: "+function1.apply(10));

        Function<String,String> function2 = String :: toUpperCase;
        System.out.println("Convert To Uppercase: "+function2.apply("java"));

        Function<Employee,String> function3 = Employee::getName;
        Employee employee = new Employee("Sumit",101,90000.0);

        System.out.println("Get Name of Employee: "+function3.apply(employee));

        Function<Employee,Double> function4 = Employee::getSalary;
        Employee emp1 = new Employee("Sumit",101,90000.0);

        System.out.println("Get Salary of Employee: "+function4.apply(employee));





    }
}

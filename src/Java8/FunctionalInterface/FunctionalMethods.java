package Java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalMethods {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(111, "John", 81.0, "Mathematics"));
        studentList.add(new Student(222, "Harsha", 79.5, "History"));
        studentList.add(new Student(333, "Ruth", 87.2, "Computers"));
        studentList.add(new Student(444, "Aroma", 63.2, "Mathematics"));
        studentList.add(new Student(555, "Zade", 83.5, "Computers"));
        studentList.add(new Student(666, "Xing", 58.5, "Geography"));
        studentList.add(new Student(777, "Richards", 72.6, "Banking"));
        studentList.add(new Student(888, "Sunil", 86.7, "History"));

        studentList.add(new Student(999, "Jordan", 58.6, "Finance"));
        studentList.add(new Student(101010, "Chris", 89.8, "Computers"));

        //Predicate Method
        Predicate<Student> mathematicsPredicate = s -> s.getSpecialization().equals("Mathematics");
        List<Student> mathematics = new ArrayList<>();

        for(Student s : studentList){
            if(mathematicsPredicate.test(s)){
                mathematics.add(s);
            }
        }
        System.out.println(mathematics);
        System.out.println();
        System.out.println("Above 80 marks Student");

        Predicate<Student> above80 = (Student s) -> s.getPercentage()>80;
        for(Student s : studentList){
            if(above80.test(s)){
                System.out.println(s);
            }
        }
        System.out.println();
        System.out.println("Below 60 marks Student");
        Predicate<Student> below60 = (Student s) -> s.getPercentage()<60;
        for(Student s: studentList){
            if(below60.test(s)){
                System.out.println(s.getName());
            }
        }

        System.out.println();
        System.out.println("Computer Specialization Students");
        Predicate<Student> computerField = (Student s) -> s.getSpecialization().equals("Computers");
        for(Student s : studentList){
            if(computerField.test(s)){
                System.out.println(s.getName()+":"+s.getSpecialization());
            }
        }
        System.out.println();
        System.out.println("Starts with J");
        Predicate<Student> startsWithJ = (Student s) -> s.getName().startsWith("J");
        for(Student s : studentList){
            if(startsWithJ.test(s)){
                System.out.println(s.getName()+":"+s.getSpecialization());
            }
        }

        System.out.println();
        System.out.println("Percentage Between");
        Predicate<Student> inBetween = (Student s) -> s.getPercentage() >= 70 && s.getPercentage()<= 80;
        for(Student s : studentList){
            if(inBetween.test(s)){
                System.out.println(s.getName()+":"+s.getPercentage());
            }
        }

        System.out.println();
        System.out.println("Combining Predicates");
        Predicate<Student> result = computerField.and(above80);
        for (Student s: studentList){
            if(result.test(s)){
                System.out.println(s);
            }
        }

        System.out.println();
        System.out.println("Below 80");
        Predicate<Student> below80 = above80.negate();
        for(Student s : studentList){
            if(below80.test(s)){
                System.out.println(s);
            }
        }

        System.out.println();
        System.out.println("Computer or History");

        Predicate<Student> historyField = (Student s) -> s.specialization.equals("History");
        Predicate<Student> computerOrHistory = historyField.or(computerField);
        for(Student s : studentList){
            if(computerOrHistory.test(s)){
                System.out.println(s);
            }
        }
        // Consumer Method
        System.out.println();
        System.out.println("Percentage Printing");
        Consumer<Student> percentage = (Student s) -> {
            System.out.println( s.getName()+": "+ s.getPercentage());
        };

        for(Student s : studentList){
            percentage.accept(s);
        }
        System.out.println();
        System.out.println("Print Id");
        Consumer<Student> ids = (Student s) -> {
            System.out.println(s.getId());
        };
        for (Student s: studentList){
            ids.accept(s);
        }

        System.out.println();
        System.out.println("Formatted Output");
        Consumer<Student> output = (Student s) -> {
            System.out.println("Id: "+s.getId());
            System.out.println(("Name: "+s.getName()));
            System.out.println("Marks: "+s.getPercentage()+"\nSpecialization: "+s.getSpecialization());
            System.out.println();
        };

        studentList.forEach(output);
        //Consumer with Predicate
        System.out.println();
        Consumer<Student> congratulate = (Student s) -> {
            System.out.println("Congratulations: "+s.getName());
        };

        for(Student s: studentList){
            if(above80.test(s)){
                congratulate.accept(s);
            }
        }
        System.out.println();
        System.out.println("Bonus Marks");
        Consumer<Student> bonus = s -> s.setPercentage(s.getPercentage()+5);
        System.out.println("Before Updating");
        studentList.forEach(System.out::println);
        System.out.println();
        for(Student s: studentList){
            bonus.accept(s);
        }
        studentList.forEach(System.out::println);

        // Function method

        Function<Student,String> nameFunction = (Student s) -> s.getName();
        List<String> studentNames = new ArrayList<>();
         for(Student s : studentList){
             studentNames.add(nameFunction.apply(s));
         }
        System.out.println(studentNames);

        System.out.println();
        System.out.println("Returning Percentage");
         Function<Student,Double> getPercentage = s -> s.getPercentage();
         for(Student s: studentList){
             System.out.println(getPercentage.apply(s));
         }

        System.out.println();
        System.out.println("Assining Grade to student");
         Function<Student,String> grade = s -> {
          if(s.getPercentage()>= 80){
              return " :Grade A";
          } else if (s.getPercentage()>=60) {
             return  " :Grade B";
          }
          else {
              return " :Grade C";
             }
         };
         for(Student s : studentList){
             System.out.println("Name: "+s.getName()+grade.apply(s));
         }

        System.out.println();
        System.out.println("Add Email");
        Function<Student,String> email = s -> s.getName()+"@gmail.com";
        for(Student s : studentList){
            System.out.println(email.apply(s));
        }

         // Supplier Method
        Supplier<Student> studentSupplier = () -> new Student(111111, "New Student", 92.9, "Java 8");
        System.out.println(studentList);
       studentList.add(studentSupplier.get());
        System.out.println(studentList);



    }

}

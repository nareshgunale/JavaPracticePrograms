package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSet {
    public static void main(String[] args) {
        List<String> names =
                List.of(
                        "Rahul",
                        "Amit",
                        "Rahul",
                        "Nehal",
                        "Amit"
                );

        Set<String> uniqueNames = names.stream().collect(Collectors.toSet());

        System.out.println(uniqueNames);
        List<Integer> numbers = List.of(10,20,20,30,40,40);

        Set<Integer> set = numbers.stream().collect(Collectors.toSet());

        System.out.println(set);

        List<User> users = Arrays.asList(
                new User(101, "Rahul", "rahul@gmail.com"),
                new User(102, "Amit", "amit@gmail.com"),
                new User(103, "Nehal", "nehal@gmail.com"),
                new User(104, "Piyush", "piyush@gmail.com"),
                new User(105, "Karan", "amit@gmail.com")
        );
        Set<String> emails = users.stream().map(User::getEmail).collect(Collectors.toSet());
        System.out.println("Emails:"+ emails);

    }

}

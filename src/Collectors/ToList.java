package Collectors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ToList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40);
        List<Integer> list = numbers.stream().collect(Collectors.toList());
        System.out.println(list);

        List<Integer> evenNumbers = numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers:"+evenNumbers);

        List<Integer> squares = numbers.stream().map(n-> n*n).collect(Collectors.toList());
        System.out.println("Squaring :"+squares);
        List<Integer> sorted = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse Order"+sorted);

        List<Integer> unique = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique Element:"+unique);

        List<Integer> firstThree = numbers.stream().limit(3).collect(Collectors.toList());
        System.out.println("First Three Element:"+firstThree);




    }

}

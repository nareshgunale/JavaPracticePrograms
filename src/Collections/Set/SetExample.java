package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set s =new HashSet();
        s.add("Orange");
        s.add("Red");
        s.add("Green");
        s.add("Blue");
        s.add("Yellow");
        System.out.println(s);

        Set s1 = new HashSet<>();
        s1.add("White");
        s1.add("Brown");
        s1.add("Red");
        System.out.println(s1);
        System.out.println();
        s.addAll(s1);// If we use add(s1) then unpredicted output.
        System.out.println(s);

        System.out.println(s.isEmpty());
        s.remove("Green");
        System.out.println(s);
        s.remove(4);
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(s.contains("Blue"));






    }
}

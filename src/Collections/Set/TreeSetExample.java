package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set s = new TreeSet();
        System.out.println(s.isEmpty());
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(7);
        s.add(5);
        s.add(6);
        s.add(4);
        System.out.println(s);
        System.out.println(s.size());
        System.out.println();

        TreeSet<String> s1 = new TreeSet<>();
        s1.add("New York");
        s1.add("Delhi");
        s1.add("London");
        s1.add("Pune");
        System.out.println(s1);
        System.out.println(s1.first());
        System.out.println(s1.last());
        System.out.println(s1.headSet("Pune"));
        System.out.println(s1.tailSet("New York"));
        System.out.println(s1.subSet("London","New York"));
        System.out.println(s1.comparator());

    }
}

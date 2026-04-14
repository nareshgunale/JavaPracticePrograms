package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet s = new TreeSet();
        s.add(25);
        s.add(40);
        s.add((45));
        s.add((60));
        s.add((80));
        s.add(100);
        s.add(150);
        s.add(10);
        s.add(10);
        s.add(90);
        System.out.println(s);
        System.out.println(s.floor(35));
        System.out.println(s.ceiling(20));
        System.out.println(s.higher(60));
        System.out.println(s.lower(60));
        System.out.println(s.pollFirst());
        System.out.println(s.pollLast());
        System.out.println(s);
        System.out.println(s.headSet(90,true));
        System.out.println(s.tailSet(60,true));
    }
}

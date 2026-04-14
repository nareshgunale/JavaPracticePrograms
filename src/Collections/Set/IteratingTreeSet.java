package Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratingTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        System.out.println(ts);
        System.out.println("Ascending Order");
        Iterator itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println("Descending Order");
        Iterator itr1 = ts.descendingIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}

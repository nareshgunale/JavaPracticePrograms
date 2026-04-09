package Collections.Cursors;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List l = new LinkedList();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        l.add("f");
        System.out.println(l);
        ListIterator litr = l.listIterator();
        System.out.println("List Iterator in Forward Direction");

        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("In Backward Direction");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}

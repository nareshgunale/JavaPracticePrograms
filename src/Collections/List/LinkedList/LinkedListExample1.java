package Collections.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("One");
        l.add("Two");
        l.add(null);
        l.add("Four");
        l.add(5);
        System.out.println(l);


        ArrayList al = new ArrayList();
        al.add(6);
        al.add(7);
        al.add(8);

        l.addAll(5,al);
        l.add(0,"Zero");
        System.out.println(l);

        Vector v = new Vector();
        v.add(7.7);
        v.add(8.7);
        v.add(9.7);

        l.addAll(9,v);
        l.set(3,"Three");
        System.out.println(l);
        System.out.println();
        System.out.println("---------------Removing Elements-------------");
        l.remove(7.7);
        l.remove(0);
        System.out.println(l);
        l.removeLast();
        l.removeFirst();
        System.out.println(l);
        l.removeAll(v);
        System.out.println(l);


    }
}

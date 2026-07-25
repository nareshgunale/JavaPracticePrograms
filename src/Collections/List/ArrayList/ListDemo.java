package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add(20);
        l.add(10.0);
        System.out.println("Elements added:"+l);
        System.out.println("--------------------");
        System.out.println("Adding Elements with Specific Type");
        List<String> l1 = new ArrayList<String>();
        l1.add("Sumit");
        l1.add("Sudarshan");
        l1.add("Java");
        System.out.println("String Elements in L1:"+l1);
        l.addAll(l1);
        System.out.println("Combined Output:"+l);
        System.out.println("Index Of Element:"+l.indexOf("Sumit"));
        System.out.println(l.indexOf("sumit"));
        l.remove("Java");
        System.out.println(l);
        System.out.println(l.contains("Sumit"));
        System.out.println(l.containsAll(l1));
        System.out.println(l1.containsAll(l));

        System.out.println(l.get(0));
        l.add(8,"Java");
        System.out.println(l);
        List l2 = new ArrayList();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.addAll(2,l);
        System.out.println(l2);
        System.out.println(l2.get(3));
        l2.remove(5);
        l2.set(6,10);
        System.out.println(l2);
        System.out.println(l2.lastIndexOf(3));
        System.out.println(l2.lastIndexOf(4));






    }
}

package Collections.List.Vector;

import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("A");
        v.add("B");
        v.add("c");
        v.add("E");
        v.add("F");
        System.out.println(v);
        v.add(3, "D");
        System.out.println(v);
        System.out.println();
        System.out.println("First Element: " + v.firstElement());
        System.out.println("Last Element: " + v.lastElement());
        System.out.println("Check Element at position 3: " + v.elementAt(3));
        System.out.println("Contains G: " + v.contains("G"));
        System.out.println();
        String[] arr = new String[7];
        v.copyInto(arr);
        for (String arr1 : arr) {
            System.out.println(arr1);


        }
        Vector v1 = new Vector(5,10);
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        System.out.println(v1);
        System.out.println("Initial Capacity: "+v1.capacity());
        System.out.println();
        v1.addAll(v);
        v1.add(6,"G");
        System.out.println(v1);
        System.out.println("Capacity: "+v1.capacity());
        System.out.println();
        System.out.println("HashCode of Vector v1: "+v1.hashCode());
        System.out.println("Hashcode of Vector v:"+v.hashCode());
        System.out.println(v.get(5));
        System.out.println(v1.indexOf(5));//First occurrence of object otherwise returns -1.
        System.out.println(v1.lastIndexOf(5));//It returns last occurrence and searches from last and calculates from front.
        System.out.println(v1.indexOf(6));
        v1.insertElementAt("6",6);
        System.out.println(v1);
        System.out.println();
        System.out.println(v1.remove(6));
        System.out.println(v1.remove("G"));

        System.out.println(v1);
        v1.setElementAt("C",7);
        System.out.println(v1);
        System.out.println("Before Trimming: "+v1.capacity());
        v1.trimToSize();
        System.out.println("After Trimming: "+v1.capacity());

        String str = v.toString();
        System.out.println("Equivalent String: "+str);
        v.toArray();
        System.out.println(v);







    }
}
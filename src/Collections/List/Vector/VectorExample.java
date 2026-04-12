package Collections.List.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector();
        v.add("Red");
        v.add("Green");
        v.add("Yellow");
        v.add("Blue");
        v.add("Black");
        System.out.println("Vector Elements"+v);

        System.out.println("Vector Size: "+v.size());
        System.out.println("Vector Capacity: "+v.capacity());

        v.addElement("20");
        v.add(6,"30");
        v.add(null);
        System.out.println("Vector Size after Adding: "+v.size());
        System.out.println("Vector Capacity "+v.capacity());
        System.out.println();
        System.out.println("Vector Elements"+v);
        Object obj = v.clone();
        System.out.println("Clone of V: "+obj);
        v.clear();
        System.out.println(v);





    }
}

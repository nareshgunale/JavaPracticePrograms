package Collections.List.ArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<String>();
        l.add("Apple");
        l.add("Samsung");
        l.add("Vivo");
        l.add("Oneplus");
        l.add("Nothing");
        System.out.println("Synchronized Arraylist:");
        Iterator<String> itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
        l.add("Redmi");
        System.out.println(l);
    }

}

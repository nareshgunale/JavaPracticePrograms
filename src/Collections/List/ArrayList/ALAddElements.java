package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ALAddElements {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        System.out.println(al);

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        System.out.println(al1);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.addAll(al);
        for(Integer i:al1){
            al2.add(String.valueOf(i));

        }



        System.out.println(al2);
        System.out.println();
        Iterator itr = al2.iterator();
        ListIterator litr = al2.listIterator();
        System.out.println("Iterator in Forward Direction");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println("List Iterator");
        System.out.println("Iterator in Forward Direction");

        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println();
        System.out.println("Iterator in Previous Direction");
        while(litr.hasPrevious()){
//            al2.add(20); Here we will get ConcurrentModifiactionException while Iterating.
            System.out.println(litr.previous());
        }
        boolean b = al2.contains("10");
        System.out.println(b);
        System.out.println(al2.contains("90"));
        System.out.println(al2.containsAll(al));
        al2.remove(7);
        System.out.println("After removing element from index 7:"+al2);
        System.out.println(al2.isEmpty());
        System.out.println("Size: "+al2.size());
        al2.trimToSize();
        al.clear();
        System.out.println("Size:"+al.size());
        System.out.println();

        Collections.sort(al2);
        System.out.println("Sorting Using Collections Method:"+al2);





    }
}

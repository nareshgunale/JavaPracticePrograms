package Collections.Cursors;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample1 {
    public static void main(String[] args) {
        List l = new LinkedList();
        l.add("Red");
        l.add("Green");
        l.add("Blue");
        l.add("Yellow");
        l.add("Orange");

        ListIterator litr = l.listIterator();

        System.out.println("Forward Direction");
        while(litr.hasNext()){
            int index = litr.nextIndex();
            String elementA = litr.next().toString();
            System.out.println("Index:"+index+" ElementA:"+elementA);
        }

        System.out.println("\nBackward Direction");

        while(litr.hasPrevious()){
            int index = litr.previousIndex();
            String elementB = litr.previous().toString();
            System.out.println("Index1:"+index+" ElementB:"+elementB);
        }

    }
}

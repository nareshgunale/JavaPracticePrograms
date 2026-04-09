package Collections.Cursors;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample2 {
    public static void main(String[] args) {
        List l = new LinkedList();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");

        ListIterator litr = l.listIterator();
        System.out.println("ListIterator in Forward Direction");
        while(litr.hasNext()) {
            int index = litr.nextIndex();
            String ElementA = litr.next().toString();
            System.out.println("Index:" + index + " Element:" + ElementA);
        }
            System.out.println();
            litr.add("E");
            System.out.println(l);
            System.out.println();
            System.out.println("Iterator in Backward Direction");

         while (litr.hasPrevious()){
             System.out.println(litr.previous());

         }
         litr.set("j");
        System.out.println();
        System.out.println(l);

        }



    }



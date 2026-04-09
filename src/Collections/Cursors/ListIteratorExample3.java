package Collections.Cursors;
import java.util.ListIterator;
import java.util.List;
import java.util.ArrayList;

public class ListIteratorExample3 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Apple");
        l.add("Banana");
        l.add("Mango");
        l.add("Pineapple");
        System.out.println(l);

        ListIterator litr = l.listIterator();
        while (litr.hasNext()){
            Object o = litr.next();
            String s = (String)o;

            if(s.equals("Banana")){
                litr.add("Watermelon");
                System.out.println(l);
            } else if (s.equals("Mango")) {
                litr.remove();
                litr.add("A");
                System.out.println(l);

            } else if (s.equals("Pineapple")) {
                litr.set("DragonFruit");

                System.out.println(l);

            }
        }

    }
}

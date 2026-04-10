package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistSynchronization {
    public static void main(String[] args) {
        List l = new ArrayList<String>();
        l.add("Apple");
        l.add("Orange");
        l.add("Pineapple");
        l.add("Banana");
        l.add("Grapes");
        System.out.println(l);
        List<String> syncList = Collections.synchronizedList(l);
        synchronized (syncList){
            Iterator<String> itr = syncList.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
//              l.add("Mango");
            }


        }
    }
}

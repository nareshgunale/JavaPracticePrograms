package Collections.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();


        for(int i=0;i<10;i++){
            al.add(i);
        }
        System.out.println(al);
        Iterator itr = al.iterator();

        while(itr.hasNext()){
            Integer i = (Integer) itr.next();
            System.out.println(i);
            if(i%2!=0){
                itr.remove();
            }

        }
        System.out.println(al);

    }
}

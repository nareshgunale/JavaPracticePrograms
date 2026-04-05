package Collections.Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=0;i<10;i++){
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            Object o = e.nextElement();
            Integer i = (Integer)o;
            System.out.println(i);
        }
        System.out.println("------------------");
        System.out.println("Iterating Even Elements:");
        Enumeration e1 = v.elements();
        while(e1.hasMoreElements()){
//            Object o = e1.nextElement();
//            Integer i = (Integer)o;
            Integer i = (Integer)e1.nextElement();// Direct Type Casting.
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

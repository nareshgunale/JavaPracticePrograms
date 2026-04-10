package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayAndToArraylist {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("AB");
        l.add("CD");
        l.add("EF");
        l.add("HI");
        System.out.println(l);

//        Object[] arr = l.toArray();
//        for(Object obj:l){
//            System.out.println(obj);
//
//        }
        String[] s=l.toArray(new String[l.size()]);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        System.out.println("Converting Back to Arraylist");
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList(s));
        System.out.println(l1);

    }
}

package Collections.Map;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratingMqp {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("V","Violet");
        map.put("I","Indigo");
        map.put("B","Blue");
        map.put("G","Green");
        map.put("Y","Yellow");
        map.put("O","Orange");
        map.put("R","Red");
        System.out.println(map);
        Iterator<Entry<String,String>> itr = map.entrySet().iterator();
        System.out.println("Iterating via Entries:");
        while(itr.hasNext()){
            Object Entries = itr.next();
            System.out.println(Entries);
        }
        System.out.println();
        System.out.println("Iterating by only Keys: ");
        Iterator<String> itr1 = map.keySet().iterator();
        while (itr1.hasNext()){
            Object keys = itr1.next();
            System.out.println(keys);
        }


    }
}

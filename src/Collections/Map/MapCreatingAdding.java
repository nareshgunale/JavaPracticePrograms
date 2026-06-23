package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapCreatingAdding {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Blue");
        map.put(103,"White");
        map.put(104,"Green");
        map.put(106,"Yellow");
        map.put(102,"Red");
        map.put(105,"Orange");
        System.out.println(map);
        System.out.println("Size of Map: "+map.size());
        System.out.println();
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(115,"Purple");
        map1.put(120,"Brown");

        System.out.println(map1);
        System.out.println("Size of Map1: "+map1.size());
        map.putAll(map1);
        System.out.println(map);
        System.out.println("Size after Adding map1: "+map.size());
        map.remove(101);
        map.remove(104,"Green");
        System.out.println(map);

        map.remove(map1);
        System.out.println(map);//No impact

    }
}

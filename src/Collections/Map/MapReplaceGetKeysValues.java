package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapReplaceGetKeysValues {
    public static void main(String[] args) {
        Map<String,String > map = new HashMap<>();
        map.put("A","Apple");
        map.put("B","Ball");
        map.put("C","Camel");
        map.put("D","Dog");
        System.out.println(map);
        map.replace("B","Bat");
        System.out.println(map);
        map.replace("C","Camel","Cat");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("A"));
        System.out.println(map.containsKey("E"));
        System.out.println(map.containsValue("Dog"));
    }
}

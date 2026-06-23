package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class IteratingMapUsingForEach {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Sudarshan");
        map.put(102,"Sumit");
        map.put(103,"Siddhesh");
        map.put(104,"Nikhil");
        map.put(105,"Jay");
        System.out.println(map);
        for(Integer rollNo: map.keySet())
            System.out.println("Roll No: "+rollNo);
        System.out.println();
        for(String Name: map.values())
            System.out.println("Name: "+Name);
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println("Roll No: "+entry.getKey()+"Name: "+entry.getValue());
        }

    }

}

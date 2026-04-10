package Collections.List.ArrayList;

import java.util.ArrayList;

public class IteratingByWhileLoop {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(null);
        al.add(50);
        al.add(60);

        System.out.println(al);

        int i = 0;
        while(al.size()>i){
            Integer itr = al.get(i);
            System.out.println(itr);
            i++;
        }
    }
}

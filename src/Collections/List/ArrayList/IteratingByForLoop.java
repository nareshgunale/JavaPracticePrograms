package Collections.List.ArrayList;

import java.util.ArrayList;


public class IteratingByForLoop {
    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        System.out.println(al);
        System.out.println("By Using For Loop");
        int ElementSize = al.size();
        System.out.println("Size: "+ElementSize);
        for(int i =0;i< al.size();i++){
            String getElement = al.get(i);
            System.out.println(getElement);

        }
        al.set(2,"G");
        al.set(3,null);
        System.out.println("By Using Enhanced Loop");
        for(String al1:al){
            System.out.println(al1);

        }



    }
}

package Collections.List.LinkedList;

import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("USA");
        list.add("India");
        list.add("UK");
        list.add("Canada");
        list.add("Germany");
        System.out.println(list);
        System.out.println("---------Retrieve and Remove----------");
        list.peekFirst();
        list.peekLast();
        System.out.println("Retrieving by peek() Method: "+list);

        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println("After Deleting: "+list);
        System.out.println();
        System.out.println("-----------Poping and Pushing Elements-----------");
        list.pop();
        System.out.println(list);
        list.push("India");
        System.out.println(list);
    }
}

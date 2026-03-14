package String;

public class Question {
    public static void main(String[] args) {
        String s = " ";
        s.trim();//removes blank spaces but no reference so it is eligible for garbage collection.
        System.out.println(s.equals("")+"  "+s.isEmpty());//s-> it is still pointing to " "

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
    }
}

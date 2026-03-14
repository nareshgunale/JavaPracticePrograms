package String;

public class InternMethod {
    public static void main(String[] args) {
        String s1=new String("Hello");
        String s2 =s1.intern();
        System.out.println(s1==s2);

        String s3="Hello";
        System.out.println(s2==s3);
    }
}

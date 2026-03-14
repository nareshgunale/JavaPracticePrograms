package Practice.Object;

public class DifferenceBetDEqualsAndEquals {
    public static void main(String[] args) {
        String s1=new String("Hello");
        String s2 = new String("Hello");
        StringBuffer sb1=new StringBuffer("Hello");
        StringBuffer sb2=new StringBuffer("Hello");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));

       // System.out.println(s1==sb1);
        System.out.println(s1.equals(sb1));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());
    }
}

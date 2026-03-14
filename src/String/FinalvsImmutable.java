package String;

public class FinalvsImmutable {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("Hello");
        sb.append("Java");
        System.out.println(sb);

        //sb = new StringBuffer("New"); because variable is Final.
    }
}

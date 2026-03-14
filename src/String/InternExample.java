package String;

public class InternExample {

    public static void main(String[] args) throws Exception {

        String s1 = new String("Java");   // Heap Object
        String s2 = "Java";               // String Constant Pool

        System.out.println("Before intern:");
        System.out.println(s1 == s2);

        String s3 = s1.intern();

        System.out.println("After intern:");
        System.out.println(s2 == s3);

        System.out.println("Program running... Check heap now");

        // Thread to keep program alive
        Thread.sleep(600000);  // 10 minutes
    }
}
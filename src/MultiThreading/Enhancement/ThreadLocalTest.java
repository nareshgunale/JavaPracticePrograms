package MultiThreading.Enhancement;

public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal();
        System.out.println(tl.get());
        tl.set("Sumit");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());
        ThreadLocal tl2 = new ThreadLocal(){
            @Override
            public Object initialValue() {
                return "Abc";
            }
        };
        System.out.println(tl2.get());
    }
}

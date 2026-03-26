package MultiThreading.Enhancement;
class ParentThread extends Thread{
    public static InheritableThreadLocal tl = new InheritableThreadLocal() {
        public Object childValue(Object P) {
            return "cc";
        }
    };
    public void run(){
        tl.set("pp");
        System.out.println("Parent Thread Value.."+tl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }
}
class ChildThread extends Thread{
    public void run(){
        System.out.println("Child Threa value...."+ParentThread.tl.get());
    }
}
public class IheritableThreadLocalExample {
    public static void main(String[] args) {
        ParentThread pt = new ParentThread();
        pt.start();
    }
}

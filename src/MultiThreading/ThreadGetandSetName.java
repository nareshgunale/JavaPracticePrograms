package MultiThreading;
class MyThread extends Thread implements Runnable{

}
public class ThreadGetandSetName {
    public static void main(String[] args) {


        System.out.println(Thread.currentThread().getName());
        MyThread t = new MyThread();
        System.out.println(t.getName());
        Thread.currentThread().setName("ABC");
        System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        MyThread t2 = new MyThread();
        System.out.println(t2.getPriority());

    }
}

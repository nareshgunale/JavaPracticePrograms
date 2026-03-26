package MultiThreading.Enhancement;

import java.net.Socket;

public class MainThreadGroup {
    public static void main(String[] args) {
        System.out.println("Thread Group Name");
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println("--------------Sub ThreadGroup-----------------");
        ThreadGroup g = new ThreadGroup("First ThreadGroup");
        System.out.println(g.getParent().getName());
        ThreadGroup g1 = new ThreadGroup(g,"Second ThreadGroup");
        System.out.println(g1.getParent().getName());
        System.out.println(g1.getName());

        System.out.println("--------------Set Max Priority Method-----------");
        ThreadGroup g2 = new ThreadGroup("TG");
        Thread t1=new Thread(g2,"First Thread");
        Thread t2=new Thread(g2,"Second Thread");
        g2.setMaxPriority(3);
        Thread t3 = new Thread(g2,"Third Group");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
}

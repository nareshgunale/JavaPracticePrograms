package MultiThreading.Enhancement;

import java.util.concurrent.locks.ReentrantLock;

class Thread2 extends Thread{
    static ReentrantLock l = new ReentrantLock();
    Thread2(String name){
        super(name);
    }
    public void run(){
        if(l.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "I got the Lock and Performing safe Operations");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
        else{
            System.out.println(Thread.currentThread().getName()+"I didn't got the lock hence Performing Alternative Operations");

        }
    }
}
public class TryLockExample {
    public static void main(String[] args) {
        Thread2 t1=new Thread2("First Thread");
        Thread2 t2=new Thread2("Second Thread");
        Thread2 t3=new Thread2("Third Thread");
        t1.start();
        t2.start();
        t3.start();
    }

}

package MultiThreading.Enhancement;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Thread3 extends Thread{
    static ReentrantLock l = new ReentrantLock();
    Thread3(String name){
        super(name);
    }
    public void run(){
        do{
            try{
                if(l.tryLock(2000, TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName()+" I got the Lock");
                    Thread.sleep(10000);
                    l.unlock();
                    System.out.println(Thread.currentThread().getName()+"-------Releases the Lock");
                    break;
                }
                else {
                    System.out.println(Thread.currentThread().getName()+" Unable to get the Lock and try again");
                }
            }
            catch (Exception e){

            }
        }while(true);
    }
}
public class ReentrantLockExample2 {
    public static void main(String[] args) {
        Thread3 t1=new Thread3("First Thread");
        Thread3 t2=new Thread3("second Thread");
        Thread3 t3=new Thread3("Third Thread");
        t1.start();
        t2.start();
        //t3.start();
    }
}

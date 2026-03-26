package MultiThreading.Enhancement;

import java.util.concurrent.locks.ReentrantLock;

class Show{
    ReentrantLock l=new ReentrantLock();
    public void wish(String name){
        l.lock();
        for(int i=0;i<10;i++){
            System.out.print("Good Morning:");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
            System.out.println(name);
        }
        l.unlock();
    }
}
class Thread1 extends Thread{
    Show s;
    String name;
    Thread1(Show s,String name){
        this.s=s;
        this.name=name;
    }
    public void run(){
        s.wish(name);
    }
}
public class ReentrantLockExample {
    public static void main(String[] args) {
    Show s=new Show();
    Thread1 t1 = new Thread1(s,"Dhoni");
    Thread1 t2 = new Thread1(s,"Yuvraj");
    Thread1 t3 = new Thread1(s,"Kohli");
    t1.start();
    t2.start();
    t3.start();
    }
}

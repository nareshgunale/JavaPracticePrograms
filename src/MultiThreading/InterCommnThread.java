package MultiThreading;
class ThreadA extends Thread {
    int total=0;
    public void run() {
        synchronized (this) {
            for (int i = 1; i < 100; i++) {
                total = total + i;
            }
            System.out.println("Child Thread Trying to call Notify Method");
            this.notify();
        }
    }

}
public class InterCommnThread {
    public static void main(String[] args) throws InterruptedException {
       ThreadA a =new ThreadA();
       a.start();
       //Thread.sleep(1000);
       synchronized (a){
           System.out.println("Main thread trying to call wait() method");
           a.wait();//a.wait(1000);
           System.out.println(a.total);
       }

    }
}

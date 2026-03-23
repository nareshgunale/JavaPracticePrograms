package MultiThreading;
class MyThread3 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Lazy Thread");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
                System.out.println("Interrupted");
            }
        }
    }

public class InterruptMethod {
    public static void main(String[] args) throws InterruptedException {
     MyThread3 t=new MyThread3();
     t.start();
     t.interrupt();
        System.out.println("End of Main");

    }
}

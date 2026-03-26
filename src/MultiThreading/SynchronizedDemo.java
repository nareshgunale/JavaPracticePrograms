package MultiThreading;
class Display{
    public synchronized void displayn(){
        for(int i=0;i<10;i++){
            System.out.print(i);
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }
        }
    }
    public synchronized void displayc(){
        for(int i=65;i<75;i++){
            System.out.println((char)i);
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }
        }
    }
}
class MyThread4 extends Thread{
    Display d;
    MyThread4(Display d){
        this.d=d;
    }
    public void run(){
        d.displayn();
    }
}
class MyThread5 extends Thread{
    Display d;
    MyThread5(Display d){
        this.d=d;
    }
    public void run(){
        d.displayc();
    }
}
public class SynchronizedDemo {
    public static void main(String[] args) {

        Display d=new Display();
        MyThread4 t1 = new MyThread4(d);
        MyThread5 t2 = new MyThread5(d);
        t1.start();
        t2.start();


    }
}

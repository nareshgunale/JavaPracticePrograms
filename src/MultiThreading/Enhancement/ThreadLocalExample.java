package MultiThreading.Enhancement;
class CustomerThread extends Thread{
    static Integer custId = 0;
    private static ThreadLocal t1 = new ThreadLocal(){
         @Override protected Integer initialValue(){
             return ++custId;

         }

    };
    CustomerThread(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"Executing with Customer id"+t1.get());
    }

}

public class ThreadLocalExample {
    public static void main(String[] args) {
        CustomerThread c1=new CustomerThread("Customer Thread-1");
        CustomerThread c2=new CustomerThread("Customer Thread-2");
        CustomerThread c3=new CustomerThread("Customer Thread-3");
        CustomerThread c4=new CustomerThread("Customer Thread-4");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}

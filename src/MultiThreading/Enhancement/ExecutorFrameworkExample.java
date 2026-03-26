package MultiThreading.Enhancement;
import java.util.concurrent.*;
class PrintJob implements Runnable{
    String name;
    PrintJob(String name){
        this.name=name;
    }
    public void run(){
        System.out.println(name+"...Job Started by Thread:"+Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){

        }
        System.out.println(name+"...Job completed by Thread:"+Thread.currentThread().getName());
    }
}
public class ExecutorFrameworkExample {
    public static void main(String[] args) {
        PrintJob[] jobs = {new PrintJob("Suresh"),
                new PrintJob("Sudarshan"),
                new PrintJob("Nikhil"),
                new PrintJob("Sumit"),
                new PrintJob("Sidhesh"),
                new PrintJob("Chandrakant")};

        ExecutorService service = Executors.newFixedThreadPool(3);
        for (PrintJob job : jobs) {
            service.submit(job);
        }
        service.shutdown();

    }
}

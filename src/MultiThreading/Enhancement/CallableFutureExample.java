package MultiThreading.Enhancement;

import java.util.concurrent.*;

class MyCallable implements Callable {
    int num;
    MyCallable(int num){
        this.num=num;
    }
    public Object call()throws Exception{
        System.out.println(Thread.currentThread().getName()+"..To find Sum of first "+num+"Numbers:");
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
}
public class CallableFutureExample {
    public static void main(String[] args) {
        MyCallable[] jobs = {new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40), new MyCallable(50), new MyCallable(60)};
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(MyCallable job:jobs){
            Future f=service.submit(job);
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        service.shutdown();
    }
}

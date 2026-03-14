package Interface;

interface vehicle{
    void start();
    void stop();
}
class car implements vehicle{
    public void start(){
        System.out.println("Car  Started ");
    }
    public void stop(){
        System.out.println("Car  stopped");
    }
}
class bike implements vehicle{

    public void start() {
        System.out.println("Bike Started");
    }


    public void stop() {
        System.out.println("Bike Stopped");

    }
}

public class Test {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.stop();
        bike b = new bike();
        b.start();
        b.stop();


    }
}

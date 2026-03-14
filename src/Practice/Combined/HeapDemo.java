package Practice.Combined;

public class HeapDemo {
    public static void main(String[] args) {
        double mb = 1024*1024;
        Runtime rt = Runtime.getRuntime();
        System.out.println("Maximum Memory: "+rt.maxMemory()/mb);
        System.out.println("Initial Memory: "+rt.totalMemory()/mb);
        System.out.println("Free Memory: "+rt.freeMemory()/mb);
        System.out.println("Consumed Memory: "+(rt.totalMemory()-rt.freeMemory()));
    }
}

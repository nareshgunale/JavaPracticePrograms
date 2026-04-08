package MultiThreading;

public class NoOfCores {
    public static void main(String[] args) {
        int noOfCores = Runtime.getRuntime().availableProcessors();
        System.out.println(noOfCores);
    }
}

package Practice.Combined;

public class AutoboxingVsWidening {
    public static void m1(Integer I){
        System.out.println("AutoBoxing");
    }
    public static void m1(long l){
        System.out.println("Widening");
    }

    public static void main(String[] args) {
        int x=10;
        m1(x);
    }
}

package Practice.Combined;

public class WideningVsVararg {
    public static void m1(int... x){
        System.out.println("Var_Arg Method");
    }
    public static void m1(long l){
        System.out.println("Widening");
    }

    public static void main(String[] args) {
        int x=10;
        m1(x);
    }
}



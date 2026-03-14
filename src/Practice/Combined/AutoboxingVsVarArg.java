package Practice.Combined;

public class AutoboxingVsVarArg {
    public static void m1(int... x) {
        System.out.println("Var_Arg Method");
    }

    public static void m1(Integer l) {
        System.out.println("Autoboxing");
    }

    public static void main(String[] args) {
        int x = 10;
        m1(x);
    }

}
//    public static void m1(Long l){
//        System.out.println("Autoboxing");
//    }
//
//    public static void main(String[] args) {
//        int x=10;
//        m1(x);
//}compile time error.
//public static void m1(Object o){
//        System.out.println("Object Version");
//    }
//
//    public static void main(String[] args) {
//        int x=10;
//        m1(x);
//}Valid
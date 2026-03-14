package InnerClass;

public class LocalVariabeInMethod {
    public void m1(){
        int x =10;// Final
        class Inner{
            public void m2(){
                System.out.println(x);
            }
        }
        Inner i = new Inner();
        i.m2();
    }

    public static void main(String[] args) {
        LocalVariabeInMethod obj = new LocalVariabeInMethod();
        obj.m1();
    }
}

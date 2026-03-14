package InnerClass.StaticNestedClass;
interface Outer1{
    public void m1();
    interface Inner1{
        public void m2();
    }
}
class Test1 implements Outer1{
    @Override
    public void m1() {
        System.out.println("Outer Method Implementation");
    }
}
class Test2 implements Outer1.Inner1{
    @Override
    public void m2() {
        System.out.println("Inner method Implementation");
    }
}

public class OuterInnerInterfaces {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.m1();

        Test2 t2 = new Test2();
        t2.m2();


            }

    }




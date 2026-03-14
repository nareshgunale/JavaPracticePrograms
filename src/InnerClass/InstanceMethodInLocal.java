package InnerClass;
class Outer3{
    int x = 10;
    static int y = 20;

    public void m1() { // If declare this Method as Static we will get CE at line 9.
        class Inner3 {
            public void m2() {
                System.out.println(x);
                System.out.println(y);

            }
        }
        Inner3 i3 = new Inner3();
        i3.m2();
    }
}

public class InstanceMethodInLocal {
    public static void main(String[] args) {
        Outer3 obj = new Outer3();
        obj.m1();
    }

}

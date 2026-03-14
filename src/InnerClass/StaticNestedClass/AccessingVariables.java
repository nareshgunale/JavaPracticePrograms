package InnerClass.StaticNestedClass;

public class AccessingVariables {
    int x = 10;
    static int y = 20;
    static class NestedClass{
        public void m1() {
           // System.out.println(x);
            System.out.println(y);
        }

        public static void main(String[] args) {
            NestedClass n = new NestedClass();
            n.m1();
        }
    }
}

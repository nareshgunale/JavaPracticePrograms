package InnerClass;

public class MethodLocalInner{
    public void m1(){
        class Inner2 {
            public void sum(int x, int y) {
                System.out.println("Sum :" + (x + y));
            }
        }
            Inner2 i2 = new Inner2();
            i2.sum(10,20);
            i2.sum(30,40);
            i2.sum(89,89);
        }

    public static void main(String[] args) {
        MethodLocalInner obj = new MethodLocalInner();
        obj.m1();
    }
    }

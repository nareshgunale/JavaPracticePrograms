package InnerClass;
class Outer1{
    class Inner1 {
        public void m1() {
            System.out.println("M1 Method in Inner Class");

        }
    }
        public void m2(){
            Inner1 i = new Inner1();
            i.m1();
            System.out.println("M2 method of Inner Class");
        }

    }


public class AccessingInnerClassCode {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.m2();


    }
}

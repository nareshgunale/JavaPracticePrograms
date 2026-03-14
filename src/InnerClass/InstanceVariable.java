package InnerClass;
class Outer{
    int x = 100;
    class Inner{
        int x = 10;
        public void m1(){
            int x = 90;
            System.out.println(x);
            System.out.println(this.x);//System.out.println(Inner.this.x);

            System.out.println(Outer.this.x);
        }
    }
}

public class InstanceVariable {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.m1();
        System.out.println("------------");

        Outer.Inner i1 =new Outer().new Inner();
        i1.m1();
        System.out.println("---------------");
        new Outer().new Inner().m1();
    }
}

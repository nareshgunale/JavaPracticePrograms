package Abstraction;

public abstract class AbstractClass{
    int x=20;
    AbstractClass(){
        System.out.println("Constructor of Abstract Class");
    }
    public void show(){
        System.out.println("Hello Java");
    }
    final void m1(){
        System.out.println("Final Method");
    }
    static void m2(){
        System.out.println("Static Method");
    }
    abstract void msg();


}
class Test1 extends AbstractClass{
    Test1() {
        System.out.println("Constructor of Test Class ");
    }
    void msg(){
        System.out.println("Implementation of abstract method in Subclass");
    }
    public static void main(String[] args){
        AbstractClass t = new Test1();
        t.show();
        t.msg();
        t.m1();
        m2();//Correct static call either by class name or m2() within same package/Class.
        // t.m2() it is allowed but not good programming Practice.
        //why because They belong to the Class not to object.

        System.out.println("x : "+t.x);

    }
}

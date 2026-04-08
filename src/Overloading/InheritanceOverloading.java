package Overloading;
class A{
    void show(int a){
        System.out.println("Parent class Method");
    }
}
class B extends A{

    void show(int a,int b) {
        System.out.println("Child class Method");

    }
}
public class InheritanceOverloading {
    public static void main(String[] args) {


        B obj = new B();
        obj.show(10);
        obj.show(10,20);
    }
}

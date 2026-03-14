package Overloading;
class ParentClass{
    void show(int a){
        System.out.println("Parent class Method");
    }
}
class ChildClass extends ParentClass{
    void show(double d){
        System.out.println("Child Class Method");
    }
}
public class OverloadingTest {
    public static void main(String[] args) {


        ChildClass obj = new ChildClass();
        obj.show(3.5);
        obj.show(5);

        ParentClass obj2 = new ChildClass();
        obj2.show(3);
        //obj2.show(4.5); CE

        ParentClass obj3 = new ParentClass();
        obj3.show(9);
        //obj3.show(9.5); CE

    }
}

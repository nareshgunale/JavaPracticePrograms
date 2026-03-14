package Constructor;
class Parent{
    Parent(){
        System.out.println("Constructor of Parent");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Constructor");
    }
}
class GrandChild extends Child{
    GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}
public class Multilevel {
    public static void main(String[] args){
        GrandChild G =new GrandChild();
    }
}

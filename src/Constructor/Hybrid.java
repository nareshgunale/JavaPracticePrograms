package Constructor;
class A{
    A(){
        System.out.println("Constructor of A");
    }

}
class B extends A{
    B(){
        System.out.println("Constructor of B");
    }

}
class C extends B {
    C() {
        System.out.println("Constructor of C");

    }
}
class D extends B{
    D(){
        System.out.println("Constructor of D");
}

}

public class Hybrid {
        public static void main(String[] args){
            C c =new C();
            System.out.println(" ");
            D d = new D();

        }
}


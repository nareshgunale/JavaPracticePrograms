package Practice.Combined;
class Parent{

    void test(){
        System.out.println("Parent Overriding Method");
    }
}
class Child extends Parent {
    void test(){
        System.out.println("Child Overriden Method");
    }
    void show(){
        System.out.println("New Child Class Method");
    }


}


    public class IntroToCasting {
        public static void main(String[] args) {
            Child c = new Child();
            c.test();
            c.show();

            Parent p = new Child(); // Upcasting
            //p.show(); Not accessible to parent
            p.test();

            Child c1 = (Child) new Parent();// DownCasting.
            c1.show();
            c1.test();


        }


}

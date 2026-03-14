package Abstraction;

abstract class AbstractRules {
    abstract void show();
    /*
     If a method declared as abstract then class should be declared as abstract.
     Abstract class can have constructors,concrete Methods.
    */


}
abstract class Rule1 extends AbstractRules{
    // Abstract can have abstract methods or not it is not Mandatory.


}
class Rule2 extends Rule1{
    // Concrete class must provide implementation for abstract method which declared in abstract class.
    void display() {
        System.out.println("This is concrete Method");
    }
    void show(){
        System.out.println("Must implement classes declared in abstract class");
    }

}
public class Test3 {
    public static void main(String[] args){
        Rule2 obj =new Rule2();// We cannot create object of abstract classes.
        obj.show();
        obj.display();


    }

}



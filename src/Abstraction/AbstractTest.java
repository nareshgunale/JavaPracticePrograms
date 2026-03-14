package Abstraction;

abstract class Hello{
    public void m1(){
        System.out.println("Hello");
    }
    abstract public void m2();


}

public class AbstractTest extends Hello {
    public void m2(){
        System.out.println("Hi");
    }

    public static void main(String[] args){
        AbstractTest A = new AbstractTest();
        A.m1();
        A.m2();
    }

}


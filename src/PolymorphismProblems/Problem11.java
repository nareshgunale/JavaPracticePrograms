package PolymorphismProblems;

class A5
{
    static void methodOne()
    {
        System.out.println("AAA");
    }
}

class B5 extends A5
{
    static void methodOne() // It is not Overriding but it is Method Hiding so It acts as overloading.
    {
        System.out.println("BBB");
    }
}

public class Problem11
{
    public static void main(String[] args)
    {
        A5 a = new B5(); // Based on refernce type.

        a.methodOne();
    }
}
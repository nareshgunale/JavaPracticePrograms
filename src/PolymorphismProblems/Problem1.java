package PolymorphismProblems;


class A
{

}

class B extends A
{

}

class C extends B
{

}

public class Problem1
{
//    static void overloadedMethod(A a)
//    {
//        System.out.println("ONE");// Parent A
//    }

    static void overloadedMethod(B b)
    {
        System.out.println("TWO");// Child B
    }

    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");//Object is Parent of A(Universal )
    }

    public static void main(String[] args)
    {
        A a  = new C();// Reference Type Child c

        overloadedMethod(a);
    }
}
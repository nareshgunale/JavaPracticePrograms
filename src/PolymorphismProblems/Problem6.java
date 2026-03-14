package PolymorphismProblems;

class A1
{
    public A1(int i) // Constructor with Parameter.
    {
        System.out.println(1);
    }

    public A1() // No - arg Constructor.
    {
        this(10);

        System.out.println(2);
    }

    void A1() // Method with Return Type void
    {
        A1(10);

        System.out.println(3);
    }

    void A1(int i) // Overloaded Method
    {
        System.out.println(4);
    }
}


public class Problem6
{
    public static void main(String[] args)
    {
        new A1().A1(); // new A1() calls the No - arg Constructor  and A1() calls the method

    }
}



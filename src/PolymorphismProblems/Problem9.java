package PolymorphismProblems;

class A2
{
    public A2(int i)
    {
        System.out.println(myMethod(i));
    }

    int myMethod(int i)
    {
        return ++i + --i;
    }
}

class B2 extends A2
{
    public B2(int i, int j)
    {
        super(i*j);

        System.out.println(myMethod(i, j));
    }

    int myMethod(int i, int j)
    {
        return myMethod(i*j);
    }
}

public class Problem9
{
    public static void main(String[] args)
    {
        B2 b = new B2(12, 21);
    }
}
package PolymorphismProblems;

class SuperClass
{
    void superClassMethod(Number n)
    {
        System.out.println("From Super Class");
    }
}

class SubClass extends SuperClass
{
    void superClassMethod(Double d)
    {
        System.out.println("From Sub Class");
    }
}

public class Problem5
{
    public static void main(String[] args)
    {

        SuperClass sub = new SubClass();

        sub.superClassMethod(123321);// Number Type so output will be From Super Class.
    }
}

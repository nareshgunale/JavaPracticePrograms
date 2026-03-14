package PolymorphismProblems;

class ABC1
{
    void methodABC()
    {
        System.out.println(111);
    }

    void methodABC(int i)
    {
        System.out.println(222);
    }
}

class XYZ1 extends ABC1
{
    @Override
    void methodABC(int i)
    {
        System.out.println(333);
    }

    @Override
    void methodABC()
    {
        System.out.println(444);
    }
}

public class Problem13
{
    public static void main(String[] args)
    {
        ABC1 abc = new XYZ1();// Object is XYZ
        //XYZ xyz = new ABC();

        abc.methodABC(10);

        abc.methodABC();
    }
}

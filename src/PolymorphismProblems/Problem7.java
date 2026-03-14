package PolymorphismProblems;

class X3
{
    int method(int i)
    {
        return i *= i;
    }
}

class Y3 extends X3
{
    double method(double d)
    {
        return d /= d;
    }
}

class Z3 extends Y3
{
    float method(float f)
    {
        return f += f;
    }
}

public class Problem7
{
    public static void main(String[] args)
    {
        Z3 z = new Z3();

        System.out.println(z.method(21.12));
    }
}

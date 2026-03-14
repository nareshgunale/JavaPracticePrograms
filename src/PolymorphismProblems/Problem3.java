package PolymorphismProblems;

public class Problem3 {


        double overloadedMethod(double d)
        {
            return d *= d;
        }

        int overloadedMethod(int i)
        {
            return overloadedMethod(i *= i);
        }

        float overloadedMethod(float f)
        {
            return overloadedMethod(f *= f);
        }

        public static void main(String[] args)
        {
            Problem3 obj = new Problem3();

            System.out.println(obj.overloadedMethod(100));// Integer // StackOverflow.
        }
    }



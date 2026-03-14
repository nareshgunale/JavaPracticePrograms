package Abstraction;

abstract class Test {
    abstract void calculate(int a,int b);

}
class Addition extends Test{
    @Override
    void calculate(int a,int b) {
        int x = a+b;
        System.out.println("Addition : "+x);
    }
}
class Substraction extends Test{
    void calculate(int a,int b){
        int y=a-b;
        System.out.println("Substraction: "+y);
    }
}
class Multiply extends Test{
    void calculate(int a,int b){
        int z=a*b;
        System.out.println("Multiplication: "+z);
    }
}
class Division extends Test{
    void calculate(int a,int b){
        double d= (double)a/b;
        System.out.println("Division: "+d);
    }
}
public class MyTest{
    public static void main(String[] args){
        Addition A=new Addition();
        Substraction s= new Substraction();
        Multiply m = new Multiply();
        Division D=new Division();
        A.calculate(10,30);
        s.calculate(40,60);
        D.calculate(30,13);
        m.calculate(20,34);

    }
}
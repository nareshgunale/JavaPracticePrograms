package Java8.LambdaExpression;

@FunctionalInterface
interface Mupltiplication{
    int multiply(int a,int b);
}

public class Example4 {
    public static void main(String[] args) {
        Mupltiplication m = (a,b) ->{
            int result = a*b;
            System.out.println(result);
            return result;
        };
        m.multiply(30,40);
    }
}

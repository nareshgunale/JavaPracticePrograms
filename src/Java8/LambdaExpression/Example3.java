package Java8.LambdaExpression;
@FunctionalInterface
interface Addition{
    int add(int a,int b);
}
public class Example3 {
    public static void main(String[] args) {
        Addition ad = (a,b) -> {
            int result = a+b;
            System.out.println(result);
            return result;

        };
        ad.add(10,20);

    }

}

package Java8.LambdaExpression;
@FunctionalInterface
interface Greeting{
// No Parameter
     void greet();
}
public class Example1 {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello Java");
        g.greet();

    }

}

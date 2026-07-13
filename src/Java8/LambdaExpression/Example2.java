package Java8.LambdaExpression;

@FunctionalInterface
interface Message{
    void print(String msg);
}

public class Example2 {
    public static void main(String[] args) {
        Message m = (msg) -> System.out.println(msg);
        m.print("Welcome");

    }
}

package Java8.LambdaExpression;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        // Instead of Writing s-> system.out use Method reference .
        consumer.accept("Consumer takes input but returns nothing");

    }
}

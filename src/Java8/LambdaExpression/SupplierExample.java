package Java8.LambdaExpression;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // For Supplier Method we don't give any input we just get the Output

        Supplier<String> s = () -> "Hello java";
        System.out.println(s.get());
    }

}

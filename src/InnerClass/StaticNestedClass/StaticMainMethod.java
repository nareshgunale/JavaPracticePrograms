package InnerClass.StaticNestedClass;

public class StaticMainMethod {
    static class Nested1{
        public static void main(String[] args) {
            System.out.println("Static Main Method");
        }
    }

    public static void main(String[] args) {
        System.out.println("Outer Class Main Method");
    }
}

package StaticBlock;

public class StaticBlockOrder {
    {
        System.out.println("1 - Instance Block");
    }
    {
        System.out.println("2 - Instance Block");
    }
    static{
        System.out.println("1 - Static Block");
    }
    static{
        System.out.println("2 - Static Block");
    }

    public static void main(String[] args) {
        StaticBlockOrder obj = new StaticBlockOrder();
        System.out.println("Execution of Main Method");
    }
}

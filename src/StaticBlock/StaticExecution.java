package StaticBlock;

public class StaticExecution {
    {
        System.out.println("First Instance Block");
    }
    {
        System.out.println("Second Instance Block");
    }
    static{
        System.out.println("First Static Block");
    }
    static {
        System.out.println("Second Static Block");
    }
    StaticExecution(){
        System.out.println("No arg Constructor");
    }
    StaticExecution(int i){
        System.out.println("One Argument Constructor");
    }

    public static void main(String[] args) {
        StaticExecution obj1 =new StaticExecution();
        System.out.println("-----------------------");
        StaticExecution obj2 =new StaticExecution();
        System.out.println("-----------------------");
        new StaticExecution();
        new StaticExecution(10);

    }

}

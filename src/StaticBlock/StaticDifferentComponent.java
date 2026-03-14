package StaticBlock;

public class StaticDifferentComponent {
    int x = 10;
    static int y = 20;
    void display(){
        System.out.println("Instance Display Method");
    }
    static void Show(){
        System.out.println("Static Show Method ");
    }
    StaticDifferentComponent(){
        System.out.println("No arg constructor");
    }
    StaticDifferentComponent(int i){
        System.out.println("1 arg constructor");
    }
    {
        System.out.println("Instance Initialization Block");
    }
    static{
        System.out.println("Static Initialization Block");
    }

    public static void main(String[] args) {


        StaticDifferentComponent Obj = new StaticDifferentComponent();
        System.out.println("Main Method");
        Obj.display();
        Show();
        StaticDifferentComponent Obj2 = new StaticDifferentComponent(2);
        System.out.println("Value of x: "+Obj2.x);// Without object cannot be accessed
        System.out.println("Value of y: "+y);



    }

}

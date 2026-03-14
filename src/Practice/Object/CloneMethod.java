package Practice.Object;

public class CloneMethod implements Cloneable{
    int i=10;
    int j=20;

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneMethod obj1=new CloneMethod();
        CloneMethod obj2= (CloneMethod)obj1.clone();
        obj2.i=888;
        obj2.j=999;
        System.out.println(obj1.i+" "+obj1.j);
    }

}

package Practice.Object;


class cat{
    int j;
    cat(int j){
        this.j=j;
    }
}
class Dog implements Cloneable{
    cat c;
    int i;
    Dog(cat c,int i){
        this.c=c;
        this.i=i;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        cat c =new cat(20);
        Dog d1 = new Dog(c,10);
        System.out.println(d1.i+" "+d1.c.j);

        Dog d2=(Dog)d1.clone();
        d2.i=888;
        d2.c.j=90;
        System.out.println(d1.i+" "+d1.c.j);



    }
}

package Practice.Object;
class cat1{
    int j;
    cat1(int j){
        this.j=j;
    }
}
class Dog1 implements Cloneable{
    cat1 c;
    int i;
    Dog1(cat1 c,int i){
        this.c=c;
        this.i=i;
    }
    public Object clone() throws CloneNotSupportedException{
      cat1 c1=new cat1(c.j);
      Dog1 d=new Dog1(c1,i);
      return d;
    }
}
public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        cat1 c =new cat1(20);
        Dog1 d1 = new Dog1(c,10);
        System.out.println(d1.i+" "+d1.c.j);

        Dog1 d2=(Dog1)d1.clone();
        d2.i=888;
        d2.c.j=90;
        System.out.println(d1.i+" "+d1.c.j);



    }
}

package Interface;
interface Area{
    void area();

}
class Rectangle implements Area{
    int length=10,breadth =8;@Override
    public void area() {
        System.out.println("Area of Rectangle "+(length*breadth));

    }

}
class Circle implements Area{
    double radius =2;
    @Override
    public void area() {
        System.out.println("Area of Circle "+(3.14*radius*radius));
    }

}

public class AreaTest {
    public static void main(String[] args){
       Circle c= new Circle();
       c.area();

       Rectangle r = new Rectangle();
       r.area();


    }
}

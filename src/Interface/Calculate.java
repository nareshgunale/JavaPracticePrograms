package Interface;
interface Add{
    int add(int a,int b);

}
interface Sub{
    int sub(int a,int b);
}

 class Calculate implements Add,Sub {
    public int add( int a,int b){
      return a+b;
    }
    public int sub(int a,int b){
        return b-a;
    }
    public static void main(String[] args){
        Calculate c= new Calculate();
        System.out.println("Addition "+ c.add(20,10));
        System.out.println("Substraction "+ c.sub(10,20));
    }

}

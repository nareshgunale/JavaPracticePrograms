package Interface;

  interface A {
     void msg();
     void show();


}
class B implements  A{
       public void msg(){
          System.out.println("Java");
      }
     public void show(){
          System.out.println("Hello ");
      }
      public static void main(String[] args){
           B b=new B();
           b.msg();
           b.show();


      }

}

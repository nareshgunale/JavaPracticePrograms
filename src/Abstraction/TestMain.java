package Abstraction;

 abstract class Info {
    abstract void getName(String name);
    abstract void getAge(int a);
    abstract void getCity(String city);

}
class student extends Info{
    @Override
    void getName(String name) {
        System.out.println("Name: "+name);

    }

    @Override
    void getAge(int a) {
        System.out.println("Age: "+a);
    }

    @Override
    void getCity(String city) {
        System.out.println("City: "+city);

    }
    void getCountry(String Country){
        System.out.println("Country: "+Country);

    }
    void marks( int m){
        System.out.println("Marks: "+m);

    }
}
class TestMain{
    public static void main(String[] args){
        Info i= new student();
        i.getName("Sumit");
        i.getAge(21);
        i.getCity("Pune");

//        i.marks();
//        i.getCountry("India"); By Parent Reference we are not allowed to access child methods.

        student s = new student();
        s.marks(90);
        s.getCountry("India");

    }

}

package Constructor;
class ConstructorTypes{
    ConstructorTypes(){
        System.out.println("No Argument Constructor");
    }
    ConstructorTypes(int a){
        System.out.println("1 Argument");
        // If we don't provide any constructor then default constructor is provided by the JVM.
    }
}

public class Types {
    public static void main(String[] args) {
        ConstructorTypes ct = new ConstructorTypes();
        ConstructorTypes obj = new ConstructorTypes(1);
        // only one constructor gets call according to the argument Type

    }
}

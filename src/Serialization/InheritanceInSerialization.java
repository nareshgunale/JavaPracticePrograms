package Serialization;

import java.io.*;

class Animal{
    int i=10;
    Animal(){
        System.out.println("Constructor Called");
    }
}
class Dog1 extends Animal implements Serializable {
    int j=20;

}
public class InheritanceInSerialization {
    public static void main(String[] args) throws Exception {
        Dog1 d1 = new Dog1();
        System.out.println(d1.i+"--"+d1.j);
        d1.i=999;
        d1.j=888;
        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("InheritanceSerializable.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        System.out.println("Desrialization Implemented");
        FileInputStream fis = new FileInputStream("InheritanceSerializable.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog1 d2 = (Dog1)ois.readObject();
        System.out.println(d2.i+"-----"+d2.j);



    }

}

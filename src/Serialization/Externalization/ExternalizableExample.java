package Serialization.Externalization;

import java.io.*;

class ExternalizableDemo implements Externalizable{
    String s;
    int i;
    int j;
    public ExternalizableDemo(){
        System.out.println("Constructor Required Otherwise we will get InvalidClassException ");
    }
    public ExternalizableDemo(String s,int i,int j){
        this.s=s;
        this.i=i;
        this.j=j;

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s=(String) in.readObject();
        i=in.readInt();
    }
}
public class ExternalizableExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Serialization Started");
        ExternalizableDemo ex1 = new ExternalizableDemo("Sumit", 10, 20);
        FileOutputStream fos = new FileOutputStream("Externalizable.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ex1);

        System.out.println("Deserialization Started");
        FileInputStream fis = new FileInputStream("Externalizable.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizableDemo ex2 =(ExternalizableDemo) ois.readObject();
        System.out.println(ex2.s+"---------"+ex2.i+"----"+ex2.j);


    }
}

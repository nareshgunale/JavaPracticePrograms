package Serialization;

import java.io.*;

class Account implements Serializable{
    String username = "Sumit";
    transient String password = "07";
    //transient int pin = 1234;
    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();
        String encrypPassword ="123"+password;
        //int epin=4444+pin;
        os.writeObject(encrypPassword);
        //os.writeObject(epin);

    }
    private void readObject(ObjectInputStream is) throws Exception{
        is.defaultReadObject();
        String encrpPassword = (String)is.readObject();
        password=encrpPassword.substring(3);
        //int epin=is.readInt();
        //epin = epin-4444;

    }
}
public class CustomizedSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account a1 = new Account();
        System.out.println(a1.username+"-----"+a1.password);
        FileOutputStream fos = new FileOutputStream("abc1.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("abc1.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a2 = (Account)ois.readObject();
        System.out.println(a2.username+"----"+a2.password);



    }
}

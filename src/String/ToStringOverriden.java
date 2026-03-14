package String;

class MyString {
    String msg;

    MyString(String msg) {
        this.msg = msg;
    }
}
public class ToStringOverriden {
    public static void main(String[] args) {
        System.out.println("Hello "+new StringBuffer("Java"));
        System.out.println("Hello "+new MyString("Java"));
    }
}





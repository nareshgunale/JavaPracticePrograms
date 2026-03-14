package Overloading;


public class Addition {
    int sum(int a,int b){
        int s= a+b;
        System.out.println("Addition of Two parameter is: "+s);
        return s;
    }
    int sum(int a, int b, int c){
        int s= a+b+c;
        System.out.println("Addition of Three Parameter is "+s);
        return s;

    }
    int sum(int a, int b, int c,int d){
        int s= a+b+c+d;
        System.out.println("Addition of Four Parameter is "+s);
        return s;
    }

    public static void main(String[] args) {
        Addition a = new Addition();
        a.sum(20,30,40);
        a.sum(45,90);
        a.sum(56,70,89,90);
    }
}

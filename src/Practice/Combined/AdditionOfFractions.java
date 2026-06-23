package Practice.Combined;

import java.util.Scanner;

public class AdditionOfFractions {
    public static int gcd(int a,int b){

        while(b!=0){
            int temp = b;
            b = a%b;
           a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        int[] b = new int[2];
        for(int i=0;i<2;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<2;i++){
            b[i] = sc.nextInt();
        }
        int a_num = a[0];
        int a_den = a[1];
        int b_num = b[0];
        int b_den = b[1];

        int numerator = a_num*b_den+b_num*a_den;
        int denominator = a_den*b_den;

        int gcd = gcd(numerator,denominator);
        numerator /=gcd;
        denominator /=gcd;
        System.out.println(numerator+" "+denominator);
        sc.close();


    }
}

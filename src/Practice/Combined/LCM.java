package Practice.Combined;

import java.util.Scanner;

public class LCM {
    public static int gcd(int m,int n){
        while(n!=0){
            int temp = n;
            n = m%n;
            m=temp;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int lcm = (m*n)/(gcd(m,n));
        System.out.println(lcm);
        sc.close();

    }
}

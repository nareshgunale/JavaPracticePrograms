package Practice.Combined;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int digits = String.valueOf(n).length();
        int sum =0;
        while(n>0){
            int digit = n%10;
            sum += Math.pow(digit,digits);
            n=n/10;

        }
        System.out.println(sum==original);
        System.out.println(sum);
        sc.close();
    }
}

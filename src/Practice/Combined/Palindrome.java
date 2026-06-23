package Practice.Combined;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = Math.abs(n);
        int temp = original;
        int reverse = 0;
        while(temp>0){
            int digit = temp%10;
            reverse = reverse*10+digit;
            temp = temp/10;
        }
        System.out.println(reverse==original);
        sc.close();
    }
}

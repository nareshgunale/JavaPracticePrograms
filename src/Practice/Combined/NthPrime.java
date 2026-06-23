package Practice.Combined;

import java.util.Scanner;

public class NthPrime {
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;

        }
        return true;
    }
    public static int NthPrimeNumber(int n){
        int count =0;
        int num = 1;
        while(count<n){
            num++;
            if(isPrime(num)){
                count++;
            }

        }
        return num;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Wrong Input");
            return;
        }
        int result = NthPrimeNumber(n);
        System.out.println(result);
    }
}

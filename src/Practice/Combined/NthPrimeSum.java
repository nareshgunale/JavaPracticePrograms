package Practice.Combined;

import java.util.Scanner;

public class NthPrimeSum {
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i = 2;i*i<=num;i++){
            if(num%i==0) return false;

        }
        return true;
    }
    public static int sumOfFirstNthPrime(int n){
        int count = 0;
        int num = 1;
        int sum = 0;
        while(count<n){
            num++;
            if(isPrime(num)){
                sum+= num;
                count++;
            }
        }
        return sum;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Wrong Input");
            return;
        }
        int result = sumOfFirstNthPrime(n);
        System.out.println(result);
    }

}

package Practice.Combined;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperPrime {
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;

        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                primes.add(i);

            }
        }
        for(int i=0;i<primes.size();i++){
            int position = i+1;
            if(isPrime(position)){
                System.out.println(primes.get(i)+" ");
            }
        }
        sc.close();


    }

}

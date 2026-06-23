package Practice.Combined;
import java.util.*;

public class MNthPrime {
    //Check it is Prime or not
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;


    }
    //m th prime number
    public  static int findMthPrime(int m){
        int count = 0;
        int num = 1;
        while (count<m){
            num++;
            if(isPrime(num)){
                count++;
            }
        }
        return num;
    }
    public static int digitSumToSingle(int n){
        while(n>9){
            int sum =0;
            while(n>0){
                sum+=n%10;
                n /=10 ;
            }
            n=sum;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int Prime = findMthPrime(m);
        int Digit = digitSumToSingle(Prime);
        int result = Prime*Digit;
        System.out.println(result);
    }

}

package Practice.Combined;

import java.util.Scanner;

public class ClosestDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = n%m;
        int lower = n-r;
        int upper;
        if(n>=0){
            upper = n+(m-r);
        }
        else {
            upper = n-(m+r);
        }
        if(Math.abs(n-lower)<Math.abs(n-upper)) {
            System.out.println(lower);
        }
            else if(Math.abs(n-lower)>Math.abs(n-upper)){
                System.out.println(upper);
            }
            else {
            System.out.println(Math.abs(n-lower)>Math.abs(n-upper)?lower:upper);
        }
        }

}

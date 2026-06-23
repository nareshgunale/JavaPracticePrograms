package Practice.Combined;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        while(num.length()>1){
            int sum = 0;
            for(int i=0;i<num.length();i++){
                sum += num.charAt(i)-'0';

            }
            num = String.valueOf(sum);


        }
        System.out.println(num);
        sc.close();
    }
}

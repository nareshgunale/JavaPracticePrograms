package Practice.Combined;

import java.util.Scanner;

public class DiceOppositeFace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1||n>6){
            System.out.println("Invalid Input");
        }
        else {
            int opposite = 7 - n;
            System.out.println(opposite);
        }
        sc.close();
    }
}

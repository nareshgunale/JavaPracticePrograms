package Practice.Array;

public class EvenAndOdd {
    public static void main(String[]args) {
        int[] arr = {1, 2, 3, 4, 5, 67, 68, 34, 35, 23};
        int Evensum = 0;
        int Oddsum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even Elements:" + arr[i]);
                Evensum = Evensum + arr[i];

            }
        }
        System.out.println("Even Elements Addition:" + Evensum);
        System.out.println("");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Odd Elements:" + arr[i]);
                Oddsum = Oddsum + arr[i];
            }
        }
        System.out.println("Odd Elements Addition:" + Oddsum);
    }

}


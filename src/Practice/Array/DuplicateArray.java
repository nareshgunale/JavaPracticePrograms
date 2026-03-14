package Practice.Array;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {87, 98, 9, 30, 45, 98, 30};
        System.out.println("Duplicate values in array are:");


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(" " + arr[i]);
                    break;

                }
            }

        }
    }
}

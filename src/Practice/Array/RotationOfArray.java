package Practice.Array;

public class RotationOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int k = 2;
        k = k % n;

        int[] temp = new int[k];


        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        System.out.println("After Rotating array by k position: ");
        for (int num : arr) {
            System.out.print(num + " ");

        }
    }
}

package Practice.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {20, 24, 35, 89, 90};
        System.out.print("Original Array is: ");
        for (int num : arr) {
            System.out.print(num+" ");
        }
        int Start = 0;
        int End = arr.length - 1;
        while (Start < End) {
            int temp = arr[Start];
            arr[Start] = arr[End];
            arr[End] = temp;
            Start++;
            End--;

        }
        System.out.print("\nReversed Array:");
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}

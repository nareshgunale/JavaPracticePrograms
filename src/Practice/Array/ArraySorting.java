package Practice.Array;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {12, 20, 10, 9, 8, 25};
        String[] names = {"Abcd", "Bcad", "ABCD", "XYZ" };
        Arrays.sort(numbers);
        Arrays.sort(names);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        // Using Bubble Sort

        int[] arr = {34, 45, 23, 10, 27};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.println(num + "");
        }
    }
}

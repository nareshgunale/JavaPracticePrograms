package Practice.Array;

public class SmallestNumberAndIndex {
    public static void main(String[] args) {


        int[] arr = {20, 30, 45, 89, 2, 35};
        int smallest = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< smallest){
                smallest = arr[i];
                index = i;
            }
        }
        System.out.println("Smallest Element is: "+smallest);
        System.out.println("Index of Smallest Element is: "+index);

    }
}
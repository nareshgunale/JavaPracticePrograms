package Practice.Array;

public class SquareOfOriginalArray {
    public static void main(String[] args) {
        int [] arr = {5,1,2,3,4,5};
        int[] NewArr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            NewArr[i] = arr[i]* arr[i];

        }
        for(int num:NewArr){
            System.out.println(num+" Original Array square");
        }

    }

}

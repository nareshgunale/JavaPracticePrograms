package Practice.Array;

public class AdditionofArray {
    public static void main(String[]args){
        int[] arr = {20,40,47,56,43};
        int sum = 0;
        float average=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            average = (float)sum/arr.length;


        }
        System.out.println("Sum of Array elements= "+sum);
        System.out.println("Average of Array elements= "+average);
    }
}

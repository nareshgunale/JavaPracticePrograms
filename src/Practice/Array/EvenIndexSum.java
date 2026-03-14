package Practice.Array;

public class EvenIndexSum {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,89,30};
        int sum = 0;
        for(int i = 0;i<arr.length;i+=2){

                sum = sum+arr[i];

            }
        System.out.println("Even Element Sum is : "+sum);
        }


    }


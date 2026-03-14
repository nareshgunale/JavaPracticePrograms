package Practice.Array;

public class MaxAndMin {
    public static void main(String[]args){
        int[]arr = {1,34,30,32,87,0};
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            if(arr[i]<min){
               min=arr[i];

            }

        }
        System.out.println("Maximum value:"+max);
        System.out.println("Minimum value:"+max);
    }
}

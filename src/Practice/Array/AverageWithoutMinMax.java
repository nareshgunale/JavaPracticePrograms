package Practice.Array;

public class AverageWithoutMinMax {
    public static void main(String[]args){
        int[]arr={23,34,87,9,45,89};
        int sum=0;
        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int ExcludedSum=sum-max-min;
        int indexCount=arr.length-2;
        double average= (double)ExcludedSum/indexCount;
        System.out.println("Average without Min and Max is "+average);
    }
}

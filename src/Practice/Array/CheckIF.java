package Practice.Array;

public class CheckIF {
    public static void main(String[]args){
        int[]arr={34,2,4,89,90};
        boolean found=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 || arr[i]==-1){
                found=false;
                break;

            }
        }
        if(found){
            System.out.println("Array is without 0s and -1");
        }
        else{
            System.out.println("Array is with os and -1");
        }

    }
}

package Practice.Array;

public class MajorityElement {
    public static void main(String []args){
        int[]arr={23,3,3,8,3,9,10,3,3};
        int n=arr.length;
        boolean found=false;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;

                }
            }
            if(count>n/2){
                System.out.println("Majority Element is Present and it is: "+arr[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Majority Element is not Present");
        }
    }
}

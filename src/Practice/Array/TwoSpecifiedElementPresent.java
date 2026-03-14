package Practice.Array;

public class TwoSpecifiedElementPresent {
    public static void main(String[]args){
        int[]arr={23,34,45,56,78,89,87};
        boolean found45= false;
        boolean found78=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==45){
                found45=true;
            }
            if(arr[i]==78){
                found78=true;

            }

        }
        if(found45 && found78){
            System.out.println("Given Elements are Present in array");
        }
        else{
            System.out.println("Given Elements are not Present in array");
        }
    }
}

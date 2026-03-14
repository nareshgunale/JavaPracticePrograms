package Practice.Array;

public class TwoArraysEquality {
    public static void main(String[]args){
        int[]arr1={20,30,40,50,60};
        int[]arr2={20,30,45,50,60};
        boolean isEqual=true;

        if(arr1.length!=arr2.length){
            isEqual=false;

        }
        else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    isEqual=false;
                    break;

                }
            }
        }
        if(isEqual) {
            System.out.println("Arrays are Equal");
        }
        else{
            System.out.println("Arrays are not Equal");
        }
    }
}

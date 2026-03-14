package Practice.Array;

public class MissingElementsInArray {
    public static void main(String[] args) {
        int[] arr ={2,3,4,6,7,9,10};

        for(int i =0;i< arr.length-1;i++){
            if( arr[i+1]-arr[i]!=1){
                System.out.println("Missing Element is : "+(arr[i]+1));


        }
        }

    }
}

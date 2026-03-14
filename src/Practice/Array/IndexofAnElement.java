package Practice.Array;

public class IndexofAnElement {
    public static void main(String[]args){
        int[] arr = {20,90,30,50,80};
        int input = 80;
        int index = -1;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==input){
               index = i;
               break;

           }

        }
        if(index !=-1) {
            System.out.println("Index of given Element " + index);
        }
        else{
            System.out.println("Element not found" );
        }

    }
}

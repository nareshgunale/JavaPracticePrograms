package Practice.Array;

public class MultipleMissingValues {
    public static void main(String[] args) {
        int[] arr = {1,2,6,7,9,10};
        for(int i=0;i<arr.length-1;i++){
            int current = arr[i];
            while(current+1<arr[i+1]){
                current++;
                System.out.println("Missing Element "+current);
            }
        }
    }
}

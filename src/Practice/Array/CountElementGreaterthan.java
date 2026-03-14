package Practice.Array;

public class CountElementGreaterthan {
    public static void main(String[] args) {


        int[] arr = {10, 34, 89, 90, 78, 42};
        int GivenElement = 40;
        int count =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>GivenElement){
                count++;

            }
        }
        System.out.println("Count Elements Greater than 40 is : "+count);

    }
}

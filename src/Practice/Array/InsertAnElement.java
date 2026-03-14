package Practice.Array;

public class InsertAnElement {
    public static void main(String[]args){
        int [] arr = {10,20,30,40,50};
        int[] NewArr = new int[arr.length+1];
        int element = 45;
        int index =4;
        for(int i=0;i<index;i++){
           NewArr[i]= arr[i];
        }
        NewArr[index]=element;
        for(int i=index;i<arr.length;i++){
            NewArr[i+1]=arr[i];

        }
        for(int num:NewArr){
            System.out.println(num+"");
        }
    }
}

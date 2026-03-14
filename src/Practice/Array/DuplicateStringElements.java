package Practice.Array;

public class DuplicateStringElements {
    public static void main(String[] args) {
        String[] arr = {"AB", "bc", "cd", "ef", "AB", "cd"};
        System.out.println("Duplicate String Elements are:");
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(" "+arr[i]);
                    break;
                }
            }
        }
    }
}
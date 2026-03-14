package Practice.Array;

public class CommonElements {
    public static void main(String[]args){
        int[] arr1={23,45,56,78,90,34};
        int[] arr2={34,56,78,76,56,43};
        System.out.println("Common Elements are: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(" "+arr1[i]);
                    break;
                }
            }
        }
    }
}

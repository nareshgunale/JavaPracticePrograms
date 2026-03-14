package Practice.Array;

public class CommonStringElements {
    public static void main(String[]args){
        String[] arr1={"ab","cd","ef","jh"};
        String[] arr2={"ca","ab","lm","ef"};
        System.out.println("Common String Elements are: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i].equals(arr2[j])){
                    System.out.println(" "+arr1[i]);
                    break;
                }
            }
        }
    }
}

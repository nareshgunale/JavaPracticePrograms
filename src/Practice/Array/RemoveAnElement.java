package Practice.Array;

public class RemoveAnElement {

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
                for (int i = index; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                for (int i = 0; i < arr.length - 1; i++) {
                    System.out.println(arr[i] + "");
                }
            }
                else{
                    System.out.println("Element not found" );

                }

            }

            }





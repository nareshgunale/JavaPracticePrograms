package Practice.Array;

public class CommonElementsInSortedArray {
    public static void main(String[]args){
        int[]arr1={2,4,6,7,10,20};
        int[]arr2={3,5,8,10,15,17,20};
        int[]arr3={4,5,6,10,15,20,34};
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length && k<arr3.length){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
                System.out.println("Common Element Found:" + arr1[i]);
                i++;
                j++;
                k++;
            }
            else if(arr1[i]<arr2[j]) {
                i++;
            }
            else if(arr2[j]<arr3[k]){
                j++;
            }
            else{
                k++;

                }

            }
        }
    }


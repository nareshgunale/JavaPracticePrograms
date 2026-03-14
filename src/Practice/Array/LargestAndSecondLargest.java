package Practice.Array;

public class LargestAndSecondLargest {
//    public static void main(String[]args){
//        int[]arr={23,67,87,98,20,45};
//        int largest=arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>largest){
//                largest=arr[i];
//
//            }
//        }
//        System.out.println("Largest Element is: "+largest);
//    }
//}

       public static void main(String[]args){
           int []arr1={23,45,67,89,10,20,90};
           int largest = arr1[0];
           int secondlargest = arr1[0];
           for(int i=0;i<arr1.length;i++){
               if(arr1[i]>largest) {
                   secondlargest = largest;
                   largest = arr1[i];
               }
                   else if(arr1[i]>secondlargest && arr1[i]!=largest){
                       secondlargest  = arr1[i];


                   }


               }
           System.out.println("Secondlargest Element is "+secondlargest);
           System.out.println("largest Element is "+largest);
           }

}

package Practice.Array;

public class MissingValueInArray {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int n = arr.length + 1;
        int actualSum = 0;
        int expectedSum = n * (n + 1) / 2;

        for (int num : arr) {
            actualSum += num;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("MissingNumber is:" + missingNumber);

//           int[]arr ={1,2,3,4,5,7,8,9};
//           int n=arr.length+1;
//           int xorAll=0;
//           for(int i=1;i<=n;i++) {
//               xorAll ^= i;
//           }
//           for(int num:arr){
//               xorAll ^=num;
//           }
//        System.out.println("Missing Number is:"+xorAll);
//    }
    }
}
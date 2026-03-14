package Practice.Array;

public class LeadersInArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 13, 12, 5, 2};
        int n = arr.length;

        System.out.println("Leader Elements are:");

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                System.out.println(arr[i]);
            }
        }
    }
}


//                int[] arr = {1, 2, 13, 12, 5, 2};
//                int n = arr.length;
//
//                int maxFromRight = arr[n - 1];
//                System.out.println("Leader Elements are:");
//                System.out.println(maxFromRight);
//
//                for (int i = n - 2; i >= 0; i--) {
//                    if (arr[i] > maxFromRight) {
//                        maxFromRight = arr[i];
//                        System.out.println(arr[i]);
//                    }
//                }
//            }




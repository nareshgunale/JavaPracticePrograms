package Practice.Array;

public class CopyArray {
    public static void main(String[]args) {
        int[] OriginalArr = {25, 34, 54, 23, 38, 90};
        int[] NewArray = new int[OriginalArr.length];
        for (int i = 0; i < OriginalArr.length; i++) {
            NewArray[i] = OriginalArr[i];

        }
        System.out.println("OriginalArr");
        for (int num : OriginalArr) {
            System.out.println(num + "");
        }
        System.out.println("/nNewArray:");
        for (int num : NewArray) {
            System.out.println(num + "");
        }
    }
}

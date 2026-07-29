package Practice.LeetCode;

public class ReverseAnInteger {
    public int reverse(int x) {
        int res = 0;
        boolean isNegative = x<0;
        String strx = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(strx).reverse();
        try{
            res = Integer.parseInt(sb.toString());
        }
        catch(NumberFormatException e){
            return 0;
        }
        return isNegative ? -res : res;

    }

    public static void main(String[] args) {
        ReverseAnInteger r = new ReverseAnInteger();
        System.out.println(r.reverse(321));
        System.out.println(r.reverse(-456));
        System.out.println(r.reverse(120));
    }
}

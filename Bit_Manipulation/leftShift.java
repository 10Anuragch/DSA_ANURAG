public class leftShift {
    public static int LeftShift(int x, int n) {
        int ans = 0;
        if (n >= 0) {
            ans = (int) (x * Math.pow(2, n));// formula-->> a<<b = a*2^b
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(LeftShift(2, 2));
    }
}

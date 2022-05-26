public class sqRootBinarySrch {
    public static void main(String[] args) {
        int a = 90;
        int res = squareRoot(a);
        System.out.println(res);
    }

    static int squareRoot(int a) {
        if (a <= 0) {
            return 0;
        }
        int l = 0;
        int r = a;
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if ((mid * mid) > a) {
                r = mid - 1;
            } else if ((mid * mid) <= a) {
                ans = mid;
                l = mid + 1;
            }
        }
        return ans;
    }
}

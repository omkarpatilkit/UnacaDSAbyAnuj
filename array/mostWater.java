package array;
public class mostWater {

    static void maxWaterHold(int a[]) {
        int l = 0;
        int r = a.length - 1;
        int min;
        int maxArea = 0;

        while (l < r) {
            if (a[l] <= a[r])
                min = a[l++];
            else
                min = a[r--];

            int area = min * (r - l);
            if (area > maxArea) {
                maxArea = area;
            }

        }
        System.out.println(maxArea);

    }

    public static void main(String[] args) {

        int a[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        maxWaterHold(a);

        /*
         * 
         * | |
         * |
         * |
         * |
         * |
         * ----------------------------------------------------------------
         */

    }

}

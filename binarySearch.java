public class binarySearch {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 8;
        int res = binarySearch(a, key);
        System.out.println(res);

    }

    static int binarySearch(int a[], int key) {

        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (key == a[mid]) {
                return mid;
            } else if (key > a[mid]) {
                l = mid + 1;

            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}

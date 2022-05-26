public class bookAllocation {
    public static void main(String[] args) {
        int a[] = { 4, 10, 6, 5, 3 };
        int key = 3;
        int res = bookAllocations(a, key);
        System.out.println(res);

    }

    static int bookAllocations(int a[], int key) {

        int l = 0;
        int r = 0;
        int ans = 0;
        for (int e : a) {
            r = r + e;
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isFeasible(a, key, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    static boolean isFeasible(int a[], int students, int pageMax) {
        int count = 1;
        int pages = 0;

        for (int i = 0; i < a.length; i++) {

            if (pages + a[i] > pageMax) {
                count++;
                pages = a[i];

            } else {
                pages = pages + a[i];
            }
        }

        return count <= students;
    }

}

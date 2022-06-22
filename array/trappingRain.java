package array;

public class trappingRain {

    static void rainWaterTrapping(int a[]) {

        int l[] = new int[a.length];
        int r[] = new int[a.length];

        l[0] = a[0];

        for (int i = 1; i < a.length; i++) {
            int max = a[0];
            if (a[i] > max) {
                max = a[i];
            }

            l[i] = max;

        }

    }

    public static void main(String[] args) {
        int a[] = { 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        rainWaterTrapping(a);

    }

}

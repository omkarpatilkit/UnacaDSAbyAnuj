package bitManu;

public class swapTwoBits {

    static void swapBits(int a, int n, int m) {
        n = 1 << n;
        m = 1 << m;
        int mask = n | m;
        n = a & n;
        m = a & m;
        if (n == m) {
            System.out.println(a);
        }

        a = a ^ mask;
        System.out.println(a);

    }

    public static void main(String[] args) {
        int a = 21; // 10101
        int n = 2;
        int m = 1;
        swapBits(a, n, m); // 10011 = 19
    }

}

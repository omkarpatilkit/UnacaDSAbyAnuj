package maths;

public class gcd {

    static int gcd(int a, int b) {

        int min;
        if (a < b)
            min = a;
        else
            min = b;

        for (int i = min; i > 1; i--) {
            if (b % i == 0 && a % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(24, 36));

    }
}

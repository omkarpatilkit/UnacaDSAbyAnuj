package maths;

public class euclidGCD {

    static int euclidGCD1(int a, int b) {
        if (a == b)
            return a;
        if (a < b)
            return euclidGCD1(b, a);

        return euclidGCD1(a - b, b);

    }

    static int modifiedEuclid(int a, int b) {
        if (a == b)
            return a;

        if (b == 0)
            return a;
        if (a < b)
            return modifiedEuclid(b, a);

        return modifiedEuclid(a % b, b);
    }

    public static void main(String[] args) {
        System.out.println(euclidGCD1(24, 36));
        System.out.println(modifiedEuclid(24, 36));
    }
}

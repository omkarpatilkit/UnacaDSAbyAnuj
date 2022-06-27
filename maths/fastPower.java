package maths;

public class fastPower {

    static int fastPowerOf(int a, int b) {

        if (b == 0)
            return 1;
        if (b % 2 == 0) {
            return fastPowerOf(a, b / 2) * fastPowerOf(a, b / 2);
        }
        else {
            return fastPowerOf(a, b / 2) * fastPowerOf(a, b / 2 ) *a;
        }

    }

    public static void main(String[] args) {
        System.out.println(fastPowerOf(3, 3));
    }

}

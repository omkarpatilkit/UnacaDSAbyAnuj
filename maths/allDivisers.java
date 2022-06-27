package maths;

public class allDivisers {

    static void diviserList(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                System.out.println((n / i));
            }
        }
    }

    public static void main(String[] args) {
        int num = 30;
        diviserList(num);
    }
}

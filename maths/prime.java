package maths;

public class prime {

    static boolean primeNum(int n) {
        if (n == 1 || n == 2)
            return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                return false;
            }
        }
        return true;
    }

    static boolean primeEffi(int n) {
        if (n == 1 || n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 901;
        if (primeNum(num))
            System.out.println("prime");
        else
            System.out.println("Not prime");

        if (primeEffi(num))
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }

}

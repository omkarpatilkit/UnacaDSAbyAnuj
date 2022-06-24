package maths;

public abstract class intPalindrom {

    static boolean isPalindrom(int n) {
        int a = n;
        int digit;
        int result = 0;

        while (a > 0) {
            digit = a % 10;
            result = result * 10 + digit;
            a = a / 10;
        }

        return n == result;
    }

    public static void main(String[] args) {

        int a = 123454321;
        if (isPalindrom(a))
            System.out.println(a + " is Palindrom");
        else
            System.out.println(a + " is not Palindrom");

    }
}

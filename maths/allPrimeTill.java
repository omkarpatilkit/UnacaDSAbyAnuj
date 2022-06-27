package maths;

public class allPrimeTill {

    static void printAllPrimeNumbers(int n) {
        boolean arr[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = true;
        }
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (arr[i] == true) {
                for (int j = 2 * i; j < n; j = j + i) {
                    arr[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int num = 30;
        printAllPrimeNumbers(num);
    }

}

package rec;

public class rec5 {

    static boolean isSafe(int a[][], int n, int row, int col) {

    }

    static boolean nQueen(int a[][], int n, int row) {
        if (row == n)
            return true;

        for (int col = 0; col < n; col++) {
            if (isSafe(a, n, row, col))
                a[row][col] = 1;
        }

    }

    public static void main(String[] args) {

    }
}

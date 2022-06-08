package array;

public class ArrayBasics {

    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 7, 8, 9 };

        printArray(a);

    }
}
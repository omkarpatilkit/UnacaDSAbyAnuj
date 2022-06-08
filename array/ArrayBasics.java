package array;

public class ArrayBasics {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 7, 8, 9 };
        int key = 3;
        printArray(a);
        Boolean isThere = isPresent(a, key);
        if (isThere)
            System.out.println("present");
        deleteFirstOcc(a, 7);
    }

    static Boolean isPresent(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return true;
            }
        }
        return false;
    }

    static int isPresentInt(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void deleteFirstOcc(int a[], int key) {
        int pos = isPresentInt(a, key);
        if (pos == -1)
            return;

        for (int i = pos; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = 0;
        printArray(a);
    }
}

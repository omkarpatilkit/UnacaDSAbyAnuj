package array;

public class ArrayBasics {

    public static void main(String[] args) {
        int a[] = { 11, 1, 2, 3, 7, 8, 9 };
        int key = 3;
        printArray(a);
        Boolean isThere = isPresent(a, key);
        if (isThere)
            System.out.println("present");
        deleteFirstOcc(a, 7);
        System.out.println(maxPosition(a));
        System.out.println(secondLargest(a));
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
        else if (pos == a.length - 1) {
            a[a.length - 1] = 0;
            return;
        }

        for (int i = pos; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = 0;
        printArray(a);
    }

    static int maxPosition(int a[]) {
        int max = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }
        return max;
    }

    static int secondLargest(int a[]) {

        int max = 0;
        int secMax = -1;
        for (int i = 1; i < a.length; i++) {

            if (a[i] > a[max]) {

                secMax = max;
                max = i;
            } else if (a[i] < a[max]) {
                if (secMax == -1 || a[i] > a[secMax]) {
                    secMax = i;
                }
            }
        }
        return secMax;
    }
}

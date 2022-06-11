package array;

public class LeaderInArray {

    static void leaderInArray(int a[]) {

        // O (n^2)

        loop1: for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j])
                    continue loop1;

            }

            System.out.print(a[i] + " ");
        }

    }

    static void leaderInArrayOptimised(int a[]) {

        // O (n)

        int largest = a[a.length - 1] - 1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] >= largest) {
                largest = a[i];
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 7, 6, 1, 4, 3 };

        leaderInArray(a);
        System.out.println();
        leaderInArrayOptimised(a);
    }

}

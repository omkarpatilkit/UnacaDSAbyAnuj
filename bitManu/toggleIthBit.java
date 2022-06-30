package bitManu;

public class toggleIthBit {

    static void toggleBit(int a, int n) {

        int mask = 1;
        mask = mask << n;
        a = a ^ mask;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        int n = 2;

        toggleBit(a, n);
    }

}

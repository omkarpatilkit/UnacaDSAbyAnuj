package bitManu;

public class findIthBit {

    static void bitAtIthpostion(int a, int n) {
        int mask = 1;
        mask = mask << n;
        if ((a & mask) == 0)
            System.out.println("0");
        else
            System.out.println("1");
    }

    public static void main(String[] args) {
        int a = 10; // 1010

        bitAtIthpostion(a, 3);
    }

}

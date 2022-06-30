package bitManu;

public class countSetBit {

    static void countSetBit1(int a) {
        int cnt = 0;
        while (a != 0) {
            if ((a & 1) == 1)
                cnt++;
            a = a >> 1;

        }
        System.out.println(cnt);
    }

    static void countSetBitOptimised(int a) {
        int cnt = 0;

        /**
         * a = 10
         * 
         * 10 = 1010
         * 9 = 1001
         * 10 & 9 = 1000; cnt++
         * 1000 = 8;
         * 8 & 7 = 1000 & 0111 = 0; cnt++
         */

        while (a != 0) {
            a = a & (a - 1);
            cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        int a = 23;
        countSetBit1(a);
        countSetBitOptimised(a);

    }
}

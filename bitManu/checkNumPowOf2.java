package bitManu;

public class checkNumPowOf2 {

    static void checkNumPowOfTwo(int a) {
        int cnt = 0;

        while (a != 0) {

            if ((a & 1) == 1)
                cnt++;
            a = a >> 1;

        }

        if (cnt == 1)
            System.out.println("it is power of 2");
        else
            System.out.println("It is not power of 2");
    }

    public static void main(String[] args) {
        int a = 64;
        checkNumPowOfTwo(a);
    }

}

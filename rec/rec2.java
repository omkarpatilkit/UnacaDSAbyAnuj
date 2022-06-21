package rec;

public class rec2 {

    static int facto(int a) {
        if (a <= 0)
            return 1;
        return a * facto(a - 1);
    }

    public static void main(String[] args) {
        int a = 6;
        System.out.println(facto(a));
    }
}

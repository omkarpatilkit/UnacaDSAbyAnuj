package rec;

public class rec3 {
    static void subset(String s) {
        generateSubSet(s, 0, "");
    }

    static void generateSubSet(String s, int i, String curr) {
        if (i == s.length()) {
            System.out.println(curr);
            return;
        }
        generateSubSet(s, i + 1, curr);
        generateSubSet(s, i + 1, curr + s.charAt(i));
    }

    public static void main(String[] args) {
        String str = "abc";
        subset(str);

    }

}

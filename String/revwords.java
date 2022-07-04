package String;

public class revwords {

    static void reverseInWords(char[] a, int i, int j) {
        while (i < j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    static void reversWords(String s) {
        char c[] = s.toCharArray();
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            if (c[end] == ' ') {
                reverseInWords(c, start, end - 1);
                start = end + 1;
            }
        }
        reverseInWords(c, start, s.length() - 1);
        reverseInWords(c, 0, s.length() - 1);
        System.out.println(c);
    }

    public static void main(String[] args) {
        String s = "I am the boss";
        reversWords(s);
    }

}

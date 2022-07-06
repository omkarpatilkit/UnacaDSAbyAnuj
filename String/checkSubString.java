package String;

public class checkSubString {

    static void checkSubStringLocations(String s1, String s2) {
        boolean found = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i + j) != s2.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found)
                    System.out.println(i);
            }
            found = true;
        }
    }

    public static void main(String[] args) {
        String s1 = "abadcaabcabc";
        String s2 = "abc";

        checkSubStringLocations(s1, s2);
    }

}

public class Q____PermutationString {
    public static void main(String[] args) {
        String s = "abc";
        int c = recur(s, "");
        System.out.println(c);
    }

    static int x = 0;

    public static int recur(String s, String ans) {
        if (s.length() == 0) {
            x++;
            System.out.println(ans);
            return 1;
        }
        for (int i = 0; i < s.length(); i++) {
            recur(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
        }
        return x;
    }
}

public class Permutation {
    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        arrange(s, ans);

    }

    public static void arrange(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arrange(s.substring(0, i) + s.substring(i + 1), ans + ch);
        }
    }
}


public class Paranthesis {
    public static void main(String[] args) {
        int n = 2;
        String ans = "";
        gp(n, 0, 0, ans);
    }

    public static void gp(int n, int o, int c, String ans) {
        if (o == n && c == n) {
            System.out.println(ans);
            return;
        }
        if (o < n) {
            gp(n, o + 1, c, ans + "(");
        }
        if (c < o) {
            gp(n, o, c + 1, ans + ")");
        }
    }
}

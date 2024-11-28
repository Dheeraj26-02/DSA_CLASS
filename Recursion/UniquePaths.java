public class UniquePaths {
    public static void main(String[] args) {
        int m = 3, n = 3;
        String ans = "";
        int c = unique(m, n, 0, 0, ans);
        System.out.println(c);
    }

    public static int unique(int m, int n, int x, int y, String ans) {
        if (x == m - 1 && y == n - 1) {
            System.out.println(ans);
            return 1;
        }
        if (x > m || y > n) {
            return 0;
        }
        int a = unique(m, n, x + 1, y, ans + "V");
        int b = unique(m, n, x, y + 1, ans + "H");
        return a + b;
    }
}

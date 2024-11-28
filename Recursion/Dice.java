public class Dice {
    public static void main(String[] args) {
        String ans = "";
        int start = 0;
        int end = 7;
        solve(start, end, ans);
    }

    public static void solve(int s, int e, String ans) {
        if (s == e) {
            System.out.println(ans);
            return;
        } else if (s > e) {
            return;
        }
        for(int i=1;i<=6;i++)
        {
            solve(s+i,e,ans+i);
        }
    }
}

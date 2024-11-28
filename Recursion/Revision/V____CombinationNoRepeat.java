public class V____CombinationNoRepeat {
    public static void main(String[] args) {
        int person = 2;
        int seats = 4;
        boolean s[] = new boolean[seats];
        recur(person, s, 0, "", 0);
    }

    public static void recur(int n, boolean s[], int cur, String ans, int idx) {
        if (cur == n) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < s.length; i++) {
            if (s[i] == false) {
                s[i] = true;
                recur(n, s, cur + 1, ans + "S" + (i + 1) + " P" + (cur + 1) + " ", i);
                s[i] = false;
            }
        }
    }
}

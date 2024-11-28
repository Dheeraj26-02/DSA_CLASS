public class Toss {
    static int c = 0;

    public static void main(String[] args) {
        String s = "";
        String st = "";
        int n = 3;
        toss(s, n);
        System.out.println(c);
        c = 0;
        System.out.println();
        conshead(st, n);
        System.out.println(c);
    }

    public static void toss(String s, int n) {
        if (n == 0) {
            System.out.println(s);
            ++c;
            return;
        }
        toss(s + "T", n - 1);
        toss(s + "H", n - 1);
    }

    public static void conshead(String st, int n) {
        {
            if (n == 0) {
                System.out.println(st);
                ++c;
                return;
            }
            conshead(st + "T", n - 1);
            if (st.length() == 0 || st.charAt(st.length() - 1) != 'H') {
                conshead(st + "H", n - 1);
            }
        }
    }
}

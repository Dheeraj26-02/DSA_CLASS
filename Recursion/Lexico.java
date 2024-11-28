public class Lexico {
    public static void main(String[] args) {
        int n=20;
        lexico(20,0);
    }

    public static void lexico(int t,int cur) {
        int i = 0;
        if (cur > t) {
            return;
        }
        System.out.println(cur);
        if (cur == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            lexico(t,cur * 10 + i);
        }
    }
}

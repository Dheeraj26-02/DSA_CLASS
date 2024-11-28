public class SubSequence {
    static int c = 0;

    public static void main(String[] args) {
        String s = "123";              //2^n
        String ans = "";
        System.out.println(sequence(s, ans));
    }

    public static int sequence(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            c++;
            return c;
        }
        char ch = s.charAt(0);
        sequence(s.substring(1), ans + ch);
        sequence(s.substring(2), ans+ch+s.charAt(1));
        return c;
    }
}

import java.util.ArrayList;
import java.util.List;

public class T____Keypad {
    static String d[] = {"", "","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        String digits = "23";
        List<String> l = new ArrayList<>();
        if (digits.length() == 0) {
            System.out.println(l);
        }
        key(digits, "", l);
        System.out.println(l);
    }
    public static void key(String s, String ans, List<String> l) {
        if (s.length() == 0) {
            l.add(ans);
            return;
        }
        char ch = s.charAt(0);
        String p = d[ch - '0'];
        for (int i = 0; i < p.length(); i++) {
            key(s.substring(1), ans + p.charAt(i), l);
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class PermutationDuplicate {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        String s = "aba";
        String ans = "";
        arrange(s, ans, l);
        System.out.println(l);
    }

    public static void arrange(String s, String ans, List<String> l) {
        boolean flag = true;
        if (s.length() == 0 && flag) {
            l.add(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            flag = true;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arrange(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i), l);
            }
            else
            {
                arrange(s.substring(0, i) + s.substring(i + 1), ans , l);

            }
        }
    }
}
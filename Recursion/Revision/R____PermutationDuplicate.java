public class R____PermutationDuplicate {
    public static void main(String[] args) {
        String s = "abca";
        int c = recur(s, "");
        System.out.println(c);
    }

    static int x = 0;

    public static int recur(String s, String ans) {
        boolean flag = false;
        if (s.length() == 0 && flag==false) {
            x++;
            System.out.println(ans);
            return 1;
        }
        for (int i = 0; i < s.length(); i++) {
            flag=false;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                recur(s.substring(0, i) + s.substring(i + 1), ans);
            } else {
                recur(s.substring(0, i) + s.substring(i + 1), ans+s.charAt(i));
            }
        }
        return x;
    }
}

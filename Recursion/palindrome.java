import java.util.ArrayList;import java.util.List;public class palindrome {    public static boolean Palin(String st) {        int start = 0;        int end = st.length() - 1;        while (start < end) {            if (st.charAt(start) != st.charAt(end))                return false;            start++;            end--;        }        return true;    }    public static void solve(String s, List<List<String>> res, List<String> l) {        if (0 == s.length()) {            res.add(new ArrayList<>(l));            return;        }        for (int i =0; i < s.length(); i++) {            if (Palin(s.substring(0,i+1))) {                l.add(s.substring(0,i+1));                solve(s.substring(i+1), res, l);                l.remove(l.size() - 1);            }        }    }    public static void main(String[] args) {        String s = "aab";        List<List<String>> res = new ArrayList<>();        List<String> list = new ArrayList<>();        solve(s, res, list);        System.out.println(res);    }}
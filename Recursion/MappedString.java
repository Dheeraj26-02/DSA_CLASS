import java.util.Scanner;

public class MappedString {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char a[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        sequence(s, "",a);
    }

    public static void sequence(String s, String ans,char []a) {
        if (s.length() == 0 ) {
            System.out.println(ans);
            return ;
        }
        char ch = s.charAt(0);
        sequence(s.substring(1), ans + a[ch-'0'-1],a);
        if(s.length()>1)
            sequence(s.substring(2), ans+a[(((s.charAt(0)-'0')*10)+(s.charAt(1)-'0')-1)],a);

    }
}

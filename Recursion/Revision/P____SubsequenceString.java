public class P____SubsequenceString {
    public static void main(String[] args) {
        String s="acc";
        int c=recur(s,"");
        System.out.println(c);
    }
    public static int recur(String s,String ans){
        if(s.length()==0)
        {
            System.out.println(ans);
            return 1;
        }
        int x=recur(s.substring(1),ans+s.charAt(0));
        int y=recur(s.substring(1),ans);
        return x+y;
    }
}

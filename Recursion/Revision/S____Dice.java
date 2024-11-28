public class S____Dice {
    public static void main(String[] args) {
        int start=0;
        int end=6;
        recur(start,end,"");
    }
    public static void recur(int s,int e,String ans){
        if(s==e)
        {
            System.out.println(ans);
            return;
        } else if (s>e) {
            return;
        }
        for(int i=1;i<=3;i++)
        {
            recur(s+i,e,ans+i);
        }
    }
}

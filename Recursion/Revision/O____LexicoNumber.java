public class O____LexicoNumber {
    public static void main(String[] args) {
        int n=20;
        recur(n,0);
    }
    public static void recur(int n,int cur){
        int i=0;
        if(cur>n)
        {
            return;
        }
        if(i==0)
        {
            i=1;
        }
        System.out.println(cur);
        for(;i<=9;i++)
        {
            recur(n,cur*10+i);
        }
    }
}

public class U____Combination {
    public static void main(String[] args) {
        int person=2;
        int seats=4;
        boolean s[]=new boolean[seats];
        recur(person,s,0,"");
    }
    public static void recur(int n,boolean s[],int cur,String ans){
        if(cur==n)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length;i++){
            if(s[i]==false)
            {
                s[i]=true;
                recur(n,s,cur+1,ans+"S"+(i+1)+" P"+(cur+1)+" ");
                s[i]=false;
            }
        }
    }
}

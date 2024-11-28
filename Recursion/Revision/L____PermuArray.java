import java.util.ArrayList;
import java.util.List;

public class L____PermuArray {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int a[]={1,2,3};
        boolean b[]=new boolean[a.length];
        recur(a,l,ans,b);
        System.out.println(ans);
        System.out.println(c);
    }
    static int c=0;
    public static void recur(int arr[],List<Integer> l,List<List<Integer>> ans,boolean b[]) {
        if (l.size() == arr.length) {
            ans.add(new ArrayList<Integer>(l));
            c++;
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if(b[i]==true) continue;
            l.add(arr[i]);
            b[i]=true;
            recur(arr,l,ans,b);
            l.remove(l.size()-1);
            b[i]=false;
        }
    }
}

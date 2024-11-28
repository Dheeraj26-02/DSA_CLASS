import java.util.ArrayList;
import java.util.List;
public class J____Subsets {                                          //2^n subsets
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int []a={1,2,3};
        subset(a,0,l,ans);
        System.out.println(ans);
        l.clear();
        ans.clear();
        subsetduplicate(a,0,l,ans);
        System.out.println(ans);
    }
    public static void subset(int arr[],int i,List<Integer> l,List<List<Integer>> ans){
        if(i==arr.length){
            ans.add(new ArrayList<Integer>(l));
            return;
        }
        l.add(arr[i]);
        subset(arr,i+1,l,ans);
        l.remove(l.size()-1);
        subset(arr,i+1,l,ans);
    }
    public static void subsetduplicate(int []arr,int i,List<Integer> l,List<List<Integer>> ans){
        if(i==arr.length){
            if(!ans.contains(l))
            {
                ans.add(new ArrayList<Integer>(l));
                return;
            }
        }
        l.add(arr[i]);
        subsetduplicate(arr,i+1,l,ans);
        l.remove(l.size()-1);
        subsetduplicate(arr,i+1,l,ans);
    }
}

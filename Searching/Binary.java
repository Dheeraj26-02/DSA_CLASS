import java.util.Arrays;
public class Binary {
    public static void main(String[] args) {
        int arr[] = { 1, 39, 56, 71, 24, 91, 87 };
        int n = arr.length;
        Arrays.sort(arr);//arr=[1,24,39,56,71,87,91]
        int target = 71;
        boolean flag = false;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target==arr[mid]){
                System.out.println("Index: "+mid);
                flag=true;
                break;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(!flag){
            System.out.println("Index: "+-1);
        }
    }
}

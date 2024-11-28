public class K____SubsetSum {                  //[1,4,6,5,3]               // 6  4
    public static void main(String[] args) {                             // 1 5 4
        int arr[] = {1, 4, 6, 5, 3};                                    // 1 6 3
        int t = 10;
        int c=recur(arr, t, "", 0);
        System.out.println();
        System.out.println(c);
    }

    public static int recur(int arr[], int t, String ans, int i) {
        if (t == 0) {
            System.out.print(ans);
            System.out.println();
            return 1;
        }
        if (i == arr.length) {
            return 0;
        }
        int x=recur(arr, t, ans, i + 1);
        int y=recur(arr, t - arr[i], ans + arr[i] + " ", i + 1);
        return x+y;
    }
}

public class N____SubsetWithoutList {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        recur(arr, "", 0);
    }

    public static void recur(int arr[], String ans, int i) {
        if (i == arr.length) {
            System.out.print(ans);
            System.out.println();
            return;
        }
        recur(arr, ans, i + 1);
        recur(arr, ans + arr[i] + " ", i + 1);
    }
}
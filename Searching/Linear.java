public class Linear {
    public static void main(String[] args) {
        int arr[] = { 1, 39, 56, 71, 24, 91, 87 };
        int n = arr.length;
        int target = 99;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                flag = true;
                System.out.println("Index: " + i);
                break;
            }
        }
        if (!flag)
            System.out.println("Index: " + -1);
    }
}

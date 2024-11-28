import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Sort s = new Sort();
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = s.isSort(arr, 0);
        System.out.println(ans);
    }

    boolean isSort(int[] a, int i) {
        if (i == a.length - 1) {
            return true;
        } else if (a[i] > a[i + 1]) {
            return false;
        }
        boolean x = isSort(a, i + 1);
        return x;
    }
}

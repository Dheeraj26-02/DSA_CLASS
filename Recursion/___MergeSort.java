import java.util.ArrayList;
import java.util.List;

public class ___MergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 6, 9, 4, 11, 2, 5};
        int[] ans = mergesort(arr, 0, arr.length - 1);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] mergesort(int arr[], int s, int e) {
        if (s == e) {
            return new int []{arr[s]};
        }
        int mid = (s + e) / 2;
        int a1[] = mergesort(arr, s, mid);
        int a2[] = mergesort(arr, mid + 1, e);
        return recur(a1, a2);
    }

    public static int[] recur(int[] arr1, int[] arr2) {
        List<Integer> l = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                l.add(arr1[i]);
                i++;
            } else {
                l.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            l.add(arr1[i++]);
        }
        while (j < arr2.length) {
            l.add(arr2[j++]);
        }
        int[] b = new int[l.size()];
        for (int k = 0; k < l.size(); k++) {
            b[k] = l.get(k);
        }
        return b;
    }
}

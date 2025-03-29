package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class In_2D_Array {
    public static void main(String[] args) {
        int arr[][] = { { 3, 5 }, { 10, 14 }, { 1, 2 } };
        int n = arr.length;
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(int a[], int[] b) {// Sorting on the basis of first element
                return a[0] - b[0];
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        System.out.println();
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);// Sorting on the basis of second element
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        System.out.println();
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);// Sorting on the basis of second element(Descending)
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}

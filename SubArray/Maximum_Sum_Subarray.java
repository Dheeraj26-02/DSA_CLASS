package SubArray;

import java.util.Scanner;

public class Maximum_Sum_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : arr) {
            curSum += num;
            maxSum = Math.max(maxSum, curSum);
            if (curSum < 0) {
                curSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
// kadence algo

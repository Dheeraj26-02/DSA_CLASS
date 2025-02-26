package SubArray;

import java.util.Scanner;

public class Maximum_Abs_Sum_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int curPSum = 0;
        int curNSum = 0;
        int maxPSum = Integer.MIN_VALUE;
        int maxNSum = Integer.MAX_VALUE;
        for (int num : arr) {
            curPSum += num;
            maxPSum = Math.max(maxPSum, curPSum);
            if (curPSum < 0) {
                curPSum = 0;
            }
            curNSum += num;
            maxNSum = Math.min(maxNSum, curNSum);
            if (curNSum > 0) {
                curNSum = 0;
            }
        }
        System.out.println(Math.max(maxPSum, Math.abs(maxNSum)));
    }
}

//kadence algo
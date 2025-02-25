package SubArray;

import java.util.Scanner;

public class Count_No_of_Odd_Sum_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 0;
        int sum = 0;
        int evenC = 1;
        int oddC = 0;
        for (int num : arr) {
            sum += num;
            if (sum % 2 == 0) {
                res += oddC;
                evenC++;
            } else {
                res += evenC;
                oddC++;
            }
        }
        System.err.println(res);
    }
}

//odd-odd=even
//even-even=even
//odd-even=odd
//even-odd=odd

package Rotation;

public class AntiClockwise {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;
        int n = arr.length;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[(n + i - k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

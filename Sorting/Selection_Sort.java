public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    //smallest element is selected and swapped with the first element
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest=i;
            for (int j = i+1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
//Worst-Case Time Complexity: O(n^2)
//Best-Case Time Complexity: O(n^2)
//Average Time Complexity: O(n^2)


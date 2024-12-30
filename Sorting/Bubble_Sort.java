public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    //adjacent elements are compared and swapped if they are in the wrong order
    public static void bubbleSort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
//Worst-Case Time Complexity: O(n^2)
//Best-Case Time Complexity: O(n)
//Average Time Complexity: O(n^2)

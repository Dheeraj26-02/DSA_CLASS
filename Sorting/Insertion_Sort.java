public class Insertion_Sort {
        public static void main(String[] args) {
            int[] arr = {5, 4, 3, 2, 1};
            insertionSort(arr);
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }

        public static void insertionSort(int[] arr) {
            int n = arr.length;
            for(int i=1;i<n;i++){
                int cur=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>cur){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=cur;
            }
        }
    }
//Worst-Case Time Complexity: O(n^2)
//Best-Case Time Complexity: O(n)
//Average Time Complexity: O(n^2)


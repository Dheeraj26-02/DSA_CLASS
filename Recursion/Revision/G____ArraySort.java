public class G____ArraySort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 77, 6, 7, 8};
        System.out.println(sort(arr, 0));
    }

    static boolean sort(int[] arr, int id) {
        if (id == arr.length - 1) {
            return true;
        }
        return arr[id] < arr[id + 1] && sort(arr, id + 1);
    }
}
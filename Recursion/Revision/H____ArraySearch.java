import java.util.ArrayList;

public class H____ArraySearch {
    public static void main(String[] args) {
        int arr[] = {2, 5, 4, 8, 85, 10, 8};
        int t = 8;
        System.out.println(search(arr, t, 0));
        allIndices(arr, t, 0);
        System.out.println(l);
    }

    static ArrayList<Integer> l = new ArrayList<>();

    public static int search(int arr[], int t, int id) {
        if (id == arr.length) {
            return -1;
        }
        if (arr[id] == t) {
            return id;
        }
        return search(arr, t, id + 1);
    }

    public static void allIndices(int arr[], int t, int id) {
        if (id == arr.length) {
            return;
        }
        if (arr[id] == t) {
            l.add(id);
        }
        allIndices(arr, t, id + 1);
    }
}

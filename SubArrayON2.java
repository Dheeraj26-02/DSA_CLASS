
import java.util.*;

public class SubArrayON2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = i; j < n; j++) {
                l.add(arr[j]);
                list.add(new ArrayList<>(l));
            }
        }
        System.out.println(list);
    }
}

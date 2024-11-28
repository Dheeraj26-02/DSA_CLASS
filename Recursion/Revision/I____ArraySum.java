public class I____ArraySum {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 4, 5};
        System.out.println(sum(a, 0, 0));
    }

    public static int sum(int a[], int i, int s) {
        if (i == a.length) {
            return s;
        }
        s += a[i];
        return sum(a, i + 1, s);
    }
}

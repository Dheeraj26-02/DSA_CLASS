public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int t = 3;
        System.out.println((ffind(arr, 0, t)));
        int l = arr.length - 1;
        System.out.println((lfind(arr, l, t)));
    }

    public static int ffind(int[] a, int i, int tt) {
        if (i == a.length)
            return -1;
        else if (a[i] == tt)
            return i;
        else
            return ffind(a, i + 1, tt);
    }

    public static int lfind(int[] a, int li, int tt) {
        if (li == -1)
            return -1;
        else if (a[li] == tt)
            return li;
        else
            return lfind(a, li - 1, tt);
    }
}

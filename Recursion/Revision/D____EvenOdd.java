public class D____EvenOdd {
    public static void main(String[] args) {
        int n = 20;
        Ev(n);
        System.out.println();
        Od(n);
    }

    public static void Ev(int n) {
        if (n < 1) {
            return;
        }
        Ev(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }

    public static void Od(int n) {
        if (n < 1) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
        }
        Od(n - 1);
    }
}

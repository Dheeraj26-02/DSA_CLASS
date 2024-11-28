public class A____Print {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Normal");
        P(n);
        System.out.println();
        System.out.println("Reverse");
        RP(n);
    }

    public static void P(int n) {
        if (n < 1) {
            return;
        }
        P(n - 1);
        System.out.println(n);
    }

    public static void RP(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        RP(n - 1);
    }
}

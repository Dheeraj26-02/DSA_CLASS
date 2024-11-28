public class B____ProductAndSum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Product: "+pro(n));
        System.out.println("Sum: "+sum(n));
    }

    public static int pro(int n) {
        if (n == 1) {
            return 1;
        }
        return n * pro(n - 1);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}


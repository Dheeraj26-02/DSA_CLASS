public class E____ReversePalindrome {
    public static void main(String[] args) {
        int n = 43234;
        int c = count(n);
        System.out.println("No. of digits: " + c);
        System.out.println("Reversed No.: " + rev(n, c));
        System.out.println("Palindrome: " + palin(n, c));
    }

    public static int count(int n) {
        if (n % 10 == n) {
            return 1;
        }
        return 1 + count(n / 10);
    }

    public static int rev(int n, int c) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * (int) (Math.pow(10, c - 1)) + rev(n / 10, c - 1);
    }

    public static boolean palin(int n, int c) {

        return n == rev(n, c);
    }
}

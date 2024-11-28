public class F____CountZeros {
    public static void main(String[] args) {
        int n = 100005060;
        System.out.println(count(n, 0));
    }

    public static int count(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return count(n / 10, c + 1); //if rem==0 add counter c+1
        }
        return count(n / 10, c);
    }
}

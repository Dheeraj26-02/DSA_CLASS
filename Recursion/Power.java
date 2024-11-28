public class Power {
    public static void main(String[] args) {
        int b = 2;
        int e = 5;
        System.out.println(power(b, e));
    }

    static int power(int x, int y) {
        if (y == 0)
            return 1;
        else
            return x * power(x, y - 1);
    }
}

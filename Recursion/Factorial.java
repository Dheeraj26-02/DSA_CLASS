import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f.fact(n));
    }

    int fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }
}

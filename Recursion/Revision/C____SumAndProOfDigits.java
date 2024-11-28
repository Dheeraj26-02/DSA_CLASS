public class C____SumAndProOfDigits {
    public static void main(String[] args) {
        int n=55;
        System.out.println(sum(n));
        System.out.println(pro(n));
    }

    public static int sum(int n) {
        if(n==0)
        {
            return 0;
        }
        return n%10+sum(n/10);
    }
    public static int pro(int n) {
        if(n%10==n)
        {
            return n;
        }
        return n%10*sum(n/10);
    }
}

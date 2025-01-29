public class noOfSetBits {
    public static void main(String[] args) {
        int n=23;
        System.out.print(n+" : ");
        String s=Integer.toBinaryString(n);
        System.out.print(s+" : ");
        int setBits = 0;
        // checking number of bits in n
//        while (n > 0) {
//            n = n & (n - 1);
//            setBits++;
//        }
        while(n>0){
            setBits+=n&1;
            n=n>>1;
        }
        System.out.print(setBits);
    }
}

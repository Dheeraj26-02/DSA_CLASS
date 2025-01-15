public class setTheGivenBit {
    public static void main(String[] args) {
        int n=23;
        System.out.print(n+" : ");
        String s=Integer.toBinaryString(n);
        System.out.print(s+" : ");
        int setBit = 3;
        //setting the 4 th bit of n (000001) will be shifted
        n=n|(1<<setBit);
        String ans=Integer.toBinaryString(n);
        System.out.print(ans+" : ");
        System.out.print(n);
    }
}

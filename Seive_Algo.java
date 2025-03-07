import java.util.Arrays;

public class Seive_Algo{
    public static void main(String[] args) {

        int r=100;//find prime number from 0 to r=100

        boolean prime[]=new boolean[r+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=r;i++){
            if(prime[i]){
                for(int j=i*i;j<=r;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=0;i<r+1;i++){
            System.out.println(i+" "+prime[i]);
        }
    }
}
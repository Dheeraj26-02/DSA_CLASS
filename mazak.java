public class mazak {
    public static void main(String[] args) {
        // print(5);
        // sum(10,0);
        // System.out.println(fac(5));
        // System.out.println(fib(7));
        // System.out.println(power(5, 3));
        // System.out.println(powerLog(5,3));
        // tower(3,"Src","Help","Dest");
        // reverse("abcd",3);
        // firstlast("ajbjjgyrueija",0,'j');
        // System.out.println(sorted(new int[]{1,5,3,4},0));
        // moveX("axbcxxd",0,0,"");
        boolean arr[]=new boolean[26];
        // removeDuplicate("abbccda",0,arr,"");
        // subsequences("abc",0,"");
        // keypad("23",0,"");
        // permutations("abc","");
        // System.out.println(ratmaze(3,0,0));
        // parenthesis(2,0,0,"");
        // permuteDuplicate("aba","");
        // lexico(10,0);
        coinsChange(new int[]{2,3,5},8,"",0,0);

    }

    public static void print(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.println(n);
        // print(n-1);
    }

    public static void sum(int n, int total) {
        if (n == 0) {
            System.out.println(total);
            return;
        }
        total += n;
        sum(n - 1, total);
    }

    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * fac(n - 1);
    }

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        return fib1+fib2;
    }
    public static int power(int b,int e){
        if(e==0){
            return 1;
        }
        return b*power(b,e-1);
    }

    public static int powerLog(int e,int b){
        if(e==0){
            return 1;
        }
        int temp=powerLog(e/2,b);
        if(e%2==0){
            return temp*temp;
        }
        else{
            return temp*temp*b;
        }
    }

    public static void tower(int n,String src,String help,String dest){
        if(n==1){
            System.err.println("Transfer "+n+" from "+src+" to "+dest);
            return;
        }
        tower(n-1,src,dest,help);
        System.err.println("Transfer "+n+" from "+src+" to "+dest);
        tower(n-1, help, src, dest);
    }

    public static void reverse(String s,int i){
        if(i==0){
            System.out.print(s.charAt(i));
            return;
        }
        System.out.print(s.charAt(i));
        reverse(s, i-1);
    }

    static int first=-1;
    static int last=-1;
    public static void firstlast(String s,int idx,char ele){
        if(idx==s.length()){
            System.out.println(first+" "+last);
            return;
        }
        char cur=s.charAt(idx);
        if(cur==ele){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        firstlast(s, idx+1, ele);
    }
    public static boolean sorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return sorted(arr,idx+1);
        }
        else{
            return false;
        }
    }

    public static void moveX(String s,int idx, int count,String newS){
        if(idx==s.length()){
            for(int i=0;i<count;i++){
                newS+='x';
            }
            System.out.println(newS);
            return;
        }
        if(s.charAt(idx)!='x'){
            newS+=s.charAt(idx);
        }
        else {
            count ++;
        }
        moveX(s,idx+1,count,newS);
    }
    public static void removeDuplicate(String s,int idx,boolean[] arr,String newS){
        if(idx==s.length()){
            System.out.println(newS);
            return;
        }
        char ch=s.charAt(idx);
        if(arr[(int)ch-97]==false){
            newS+=ch;
            arr[ch-'a']=true;
        }
        removeDuplicate(s,idx+1,arr,newS);
    }
    public static void subsequences(String s,int idx,String newS){//O(2^n)
        if(idx==s.length()){
            System.out.println(newS);
            return;
        }
        subsequences(s, idx+1, newS+s.charAt(idx));
        subsequences(s, idx+1, newS);
    }

    public static String [] map={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keypad(String s,int idx,String newS){//O(4^n)
        if(idx==s.length()){
            System.out.println(newS);
            return;
        }
        char cur=s.charAt(idx);
        String mapping=map[cur-'0'];
        for(int i=0;i<map[cur-'0'].length();i++){
            keypad(s,idx+1,newS+mapping.charAt(i));
        }
    }
    public static void permutations(String s,String newS){//O(n!)
        if(s.length()==0){
            System.out.println(newS);
            return;
        }
        for(int i=0;i<s.length();i++){
            permutations(s.substring(0,i)+s.substring(i+1), newS+s.charAt(i));
        }
    }
    public static void permuteDuplicate(String s,String newS){
        boolean flag=true;
        if(s.length()==0 && flag){
            System.out.println(newS);
            return;
        }
        for(int i=0;i<s.length();i++){
            flag=true;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    flag=false;
                }
            }
            if(flag){
                permuteDuplicate(s.substring(0,i)+s.substring(i+1), newS+s.charAt(i));
            }
            else{
                permuteDuplicate(s.substring(0,i)+s.substring(i+1), newS);
            }
        }
    } 
    
    public static int ratmaze(int n,int x,int y){
        if(x==n || y==n){
            return 0;
        }
        if(x==n-1 && y==n-1){
            return 1;
        }
        int right=ratmaze(n, x, y+1);
        int down=ratmaze(n, x+1, y);
        return right+down;
    }
    public static void parenthesis(int n,int o ,int c,String ans){
        if(o==n && c==n){
            System.out.println(ans);
            return;
        }
        if(o<n){
            parenthesis(n, o+1, c, ans+"(");
        }
        if(c<o){
            parenthesis(n, o, c+1, ans+")");
        }
    }
    public static void lexico(int n,int cur){
        int i=0;
        if(cur>n){
            return;
        }
        System.out.print(cur+" ");
        if(cur==0){
            i=1;
        }
        for(;i<=9;i++){
            lexico(n, cur*10+i);
        }
    }
    public static void coinsChange(int [] arr,int target,String ans,int sum,int id){
        if(target==sum){
            System.out.println(ans);
            return;
        }
        if(target<sum){
            return;
        }
        for(int i=id;i<arr.length;i++){
            coinsChange(arr, target, ans+arr[i], sum+arr[i],id);
        }
    }
}

import java.util.Scanner;
import java.util.Stack;

public class Stack_add_at_first {
//        public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        Stack<Integer> s=new Stack<>();
//        Stack<Integer> s1=new Stack<>();
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            s.push(sc.nextInt());
//        }
//        System.out.println(s);
//        int t=sc.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            s1.push(s.pop());
//        }
//        s1.push(t);
//        for(int i=0;i<=n;i++)
//        {
//            s.push(s1.pop());
//        }
//        System.out.println(s);
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s.push(sc.nextInt());
        }
        int t=1000;
        recur(s,t);
        System.out.print(s);
    }
    public static void recur(Stack<Integer>s,int t){
        if(s.isEmpty())
        {
            s.push(t);
            return ;
        }
        int e=s.pop();
        recur(s,t);
        s.push(e);
    }
}

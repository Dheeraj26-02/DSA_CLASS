import java.util.Scanner;
import java.util.Stack;

public class Stack_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }
        reverse(s);
        System.out.print(s);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty())
        {
            return;
        }
        int e=s.pop();
        reverse(s);
        bottom(s,e);
    }
    public static void bottom(Stack<Integer>s,int t){
        if(s.isEmpty())
        {
            s.push(t);
            return ;
        }
        int e=s.pop();
        bottom(s,t);
        s.push(e);
    }
}
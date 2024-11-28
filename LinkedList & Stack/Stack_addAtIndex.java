import java.util.Scanner;
import java.util.Stack;

public class Stack_addAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }
        int t = 1000;
        recur1(s, 2, t);
        System.out.print(s);
    }

    public static void recur1(Stack<Integer> s, int idx, int t) {
        if (s.size() == (idx - 1)) {
            s.push(t);
            return;
        }
        int e = s.pop();
        recur1(s, idx, t);
        s.push(e);
    }
}

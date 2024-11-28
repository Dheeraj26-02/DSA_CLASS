import java.util.Stack;

public class STACK1 {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        System.out.println(s.peek());      // print top element.
        System.out.println(s.pop());       // remove top element.
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.size());
    }
}

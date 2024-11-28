import java.util.Scanner;

class stack{
    private int idx=-1;
    private int arr[]=new int[5];
    stack(int n){
        arr=new int [n];
    }
    public void push(int e)
    {
        idx++;
        arr[idx]=e;
    }
    public int peek()
    {
        return arr[idx];
    }
    public int pop ()throws Exception
    {
        if(idx==-1)
        {
            throw new Exception("STACK is Empty");
        }
        int x=arr[idx];
        idx--;
        return x;
    }
    public boolean isEmpty(){
        if(idx==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void print()
    {
        for(int i=0;i<=idx;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public int size()
    {
        return idx+1;
    }
}
public class Stack_Implementation {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        stack s = new stack(n);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        s.print();
        System.out.println(s.pop());
        s.print();
        System.out.println(s.size());
    }
}

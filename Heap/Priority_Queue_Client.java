public class Priority_Queue_Client {
    public static void main(String[] args) {
        Priority_Queue p_q=new Priority_Queue();
        p_q.add(10);
        p_q.add(20);
        p_q.add(30);
        p_q.add(5);
        p_q.add(3);
        p_q.add(40);
        p_q.add(-10);
        System.out.println(p_q.getMin());
        p_q.remove();
        System.out.println(p_q.getMin());
    }
}

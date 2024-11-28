class queue {
    private int arr[];
    private int rear; // to add element
    private int front; // to delete
    private int size = 0;

    queue() {
        arr = new int[5];
        rear = 0;
        front = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int element) { // to add element
        if (size == arr.length) {
            System.out.println("queue is full");
            return;
        }
        arr[rear] = element;
        rear = (rear + 1) % arr.length;
        size++;
    }

    public int deque() { // to remove element
        if (size == 0) {
            System.out.println("queue is empty");
            return -1;
        }
        int x = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return x;
    }

    public int front_element() {
        if (size == 0) {
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }
        System.out.println();
    }
}

public class Queue_Implement {
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        System.out.println(q.deque());
        System.out.println(q.deque());
        q.display();
        q.enqueue(60);
        q.display();
        System.out.println(q.front_element());
    }
}
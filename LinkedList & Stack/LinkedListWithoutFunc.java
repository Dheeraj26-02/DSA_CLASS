class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedListWithoutFunc {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp = a;
        System.out.print("Before: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
        System.out.print("Adding First: ");

        // add at first position

        Node n = new Node(1000);
        n.next = a;
        temp = n;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
        System.out.print("Adding Last: ");

        //add at last position

        Node n1 = new Node(2000);
        e.next = n1;
        temp = a;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        int size=0;
        temp=n;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Size: "+size);
    }
}

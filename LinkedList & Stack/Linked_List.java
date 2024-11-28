public class Linked_List {
    private node head;
    private node tail;
    private int size;
    class node{
        int data;
        node next;
        node(int val){
            data=val;
            next=null;
        }
    }
    public void add_at_start(int val){     //add to first position.
        node a=new node(val);                 //O(1)  time complexity.
        if(size==0)
        {
            head=a;
            tail=a;
            size++;
        }
        else {
            a.next=head;
            head=a;
            size++;
        }
    }
    public void add_at_last(int val){       //O(1) time complexity.
        node b=new node(val);
        if(size==0)
        {
            head=b;
            tail=b;
            size++;
        }
        else {
            tail.next=b;
            tail=b;
            size++;
        }
    }
    public void add_at_index(int val,int pos){  //O(n)  time complexity.
        node c=new node(val);
        node temp=head;
        if(pos==0)
        {
            add_at_start(val);
        }
        else if(pos==size)
        {
            add_at_last(val);
        }
        else {
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            node pos_1 = temp.next;
            temp.next = c;
            c.next = pos_1;
            size++;
        }
    }
    public void remove_at_first(){        //O(1) time complexity.
        if(head==null)
        {
            System.out.println("No element present in the list");
        } else if (size==1) {
            head=null;
            tail=null;
            size--;

        } else {
            node temp=head;
            head = head.next;
            temp.next=null;
            size--;
        }
    }
    public void remove_at_last(){   // O(n) time complexity.
        if(size==1)
        {
            head=null;
            tail=null;
            size--;
        }
        else{
            node temp=head;
            for(int i=0;i<size-2;i++)
            {
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
    }
    public void remove_at_index(int pos){        //O(n) time complexity.
        if(pos==0)
        {
            remove_at_first();
        }
        else if(pos==size)
        {
            remove_at_last();
        }
        else {
            node temp=head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    public void print(){                  //printing linked list.
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Linked_List l1=new Linked_List();
        l1.add_at_start(10);                 //function calling
        l1.add_at_start(20);
        l1.add_at_start(30);
        l1.add_at_start(40);
        System.out.print("Add at First: ");
        l1.print();
        l1.add_at_last(50);
        System.out.println();
        System.out.print("Add at Last: ");
        l1.print();
        System.out.println();
        System.out.print("Add at Index: ");
        l1.add_at_index(60,3);
        l1.print();
        System.out.println();
        System.out.print("Remove at first: ");
        l1.remove_at_first();
        l1.print();
        System.out.println();
        System.out.print("Remove at last: ");
        l1.remove_at_last();
        l1.print();
        System.out.println();
        System.out.print("Remove at index: ");
        l1.remove_at_index(1);
        l1.print();
    }
}

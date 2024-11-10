// package HashMap;
public class Implement {
    class Node {
        String key;
        int val;
        Node next;
    }

    private Node bucket[];

    public Implement(int n) {// default constructor
        bucket = new Node[n];
    }

    public Implement() {// parameterised constructor
        bucket = new Node[4];
    }

    public int hashFun(String key) {
        int idx = key.hashCode() % bucket.length;
        if (idx < 0) {
            idx += bucket.length;
        }
        return idx;
    }

    public void put(String key, Integer value) {
        int bn = hashFun(key);
        Node temp = bucket[bn];
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.val = value;
                return;
            }
            temp = temp.next;
        }
        Node nn = new Node();
        nn.val = value;
        nn.key = key;
        nn.next = bucket[bn];
        bucket[bn] = nn;
    }

    public Integer get(String key) {
        int bn = hashFun(key);
        Node temp=bucket[bn];
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.val;
            }
            temp = temp.next;
        }
        return null;
    }

    public Boolean containKey(String key) {
        int bn = hashFun(key);
        Node temp=bucket[bn];
        while (temp != null) {
            if (temp.key.equals(key)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

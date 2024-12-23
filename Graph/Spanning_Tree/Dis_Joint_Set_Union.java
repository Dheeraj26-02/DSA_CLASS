import java.util.*;

public class Dis_Joint_Set_Union {
    class Node {
        int val;
        int rank;
        Node parent;
    }

    HashMap<Integer, Node> map = new HashMap<>();

    public void CreateSet(int v) {// O(1)
        Node nn = new Node();
        nn.val = v;
        nn.rank = 0;
        nn.parent = nn;
        map.put(v, nn);
    }

    // Find............................................................
    public Node find(int v) {
        Node nn = map.get(v);
        return find(nn.parent);
    }

    private Node find(Node node) {
        if (node == node.parent) {
            return node;
        }
        Node nn = find(node.parent);
        node.parent = nn;    // path compression(tail recursion) saving the value of parent while coming back.
        return nn;
    }

    // Union..........................................
    public void union(int e1, int e2) {
        Node n1 = find(e1);
        Node n2 = find(e2);
        int r1 = n1.rank;
        int r2 = n2.rank;
        if (r1 == r2) {
            n2.parent = n1;
            n1.rank++;
        } else if (r1 > r2) {
            n2.parent = n1;
        } else {
            n1.parent = n2;
        }
    }
}

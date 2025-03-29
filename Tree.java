import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Tree {
    public class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    private Node root;

    public void build() {
        root = buildTree();
    }

    Scanner sc = new Scanner(System.in);

    public Node buildTree() {
        Node node = new Node(sc.nextInt());
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            node.left = buildTree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            node.right = buildTree();
        }
        return node;
    }

    public void display() {
        display(root);
    }

    private void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    public boolean find(int target) {
        return find(root, target);
    }

    private boolean find(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.val == target) {
            return true;
        }
        boolean lt = find(root.left, target);
        boolean rt = find(root.right, target);
        return lt || rt;
    }

    public int max() {
        max(root);
        return m;
    }

    static int m = Integer.MIN_VALUE;

    private boolean max(Node root) {
        if (root == null) {
            return false;
        }
        m = Math.max(m, root.val);
        return max(root.left) || max(root.right);
    }

    public int noOfNodes() {
        return noOfNodes(root);
    }

    private int noOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int lt = noOfNodes(root.left);
        int rt = noOfNodes(root.right);
        return (lt + rt) + 1;
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(r, l) + 1;
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            Node n = st.pop();
            System.out.print(n.val + " ");
            if (n.right != null) {
                st.push(n.right);
            }
            if (n.left != null) {
                st.push(n.left);
            }
        }
    }

    public void levelOrder() {
        levelOrder(root);
    }

    private void levelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int size = q.size();
            while (size > 0) {
                Node n = q.poll();
                l.add(n.val);
                if (n.left != null) {
                    q.offer(n.left);
                }
                if (n.right != null) {
                    q.offer(n.right);
                }
                size--;
            }
            list.add(l);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        t.build();
        t.display();
        System.out.println();
        System.out.println(t.find(35));
        System.out.println(t.max());
        System.out.println("Nodes:- " + t.noOfNodes());
        System.out.println("Height:- " + t.height());
        t.preOrder();
        System.out.println();
        t.levelOrder();

    }
}

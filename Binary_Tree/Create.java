import java.util.*;

public class Create {
    class Node {
        int val;
        Node left;
        Node right;
        Node()
        {
            
        }
        Node(int val)
        {
            this.val=val;
            left=right=null;
        }
    }

    private Node root;// making root node private

    public void BinaryTree() { // public function for creating tree by another class
        root = CreateTree();
    }

    Scanner sc = new Scanner(System.in);

    public Node CreateTree() {

        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;

        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = CreateTree();
        }
        return nn;
    }

    // DISPLAY
    // TREE....................................................................................................................
    public void Display() {
        System.out.print("PreOrder:- ");
        Display(root);
    }

    private void Display(Node node) {
        if (node == null) {
            return;
        }
        
        System.out.print(node.val+" ");
        Display(node.left);
        Display(node.right);

    }

    // FINDING NODE IS IN TREE OR
    // NOT............................................................................................
    public boolean find(int item) {
        return find(this.root, item);
    }

    private boolean find(Node node, int item) {

        if (node == null) {
            return false;
        }
        if (node.val == item) {
            return true;
        }

        boolean lf = find(node.left, item);
        boolean rf = find(node.right, item);

        return lf || rf;
    }

    // MAXIMUM NODE-VALUE IN THE
    // TREE..................................................................................................
    public int max() {
        return max(root);
    }
    private int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int Left = max(node.left);
        int Right = max(node.right);
        return Math.max(node.val, Math.max(Left, Right));
    }

    //No. of Nodes in Binary Tree
    //..........................................................................................................
    public int nodes() {
        return nodes(this.root);
    }

    private int nodes(Node node) {
        if (node == null) {
            return 0;
        }

        int lh = nodes(node.left);
        int rh = nodes(node.right);

        return (lh+rh) + 1;
    }


    // HEIGHT OF THE BINARY
    // TREE..........................................................................................................
    public int height() {
        return height(this.root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(lh, rh) + 1;
    }

    // Traversing in Binary Tree Recursive
    // Pre-Order-> N L R

    // PostOrder-> L R N
    // In Order-> L N R
    // Level-Order
    public void LevelOrder() {
        LevelOrder(root);
    }

    private void LevelOrder(Node root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null) {
            System.out.println(list);
            return;
        }
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                Node node = q.poll();
                l.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            list.add(l);
        }
        System.out.println(list);
    }

    // Pre-Order(iterative)
    public void Pre_order() {
        Pre_order(root);
    }

    private void Pre_order(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            Node node=st.pop();
            System.out.print(node.val+" ");
            if (node.right != null) {
                st.push(node.right);
            }
            if (node.left != null) {
                st.push(node.left);
            }
        }
    }

    //Post-Order(iterative)
    // public void Post_order() {
    //     Post_order(root);
    // }

    // private void Post_Order(Node root)
    // {
        
    // }
}

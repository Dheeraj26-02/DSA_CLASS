public class BSTConstruct {

    class Node {
        int val;
        Node left;
        Node right;
    };

    private Node root;

    public void Binary_Search_Tree(int[] in) {

        root = CreateBSTree(in, 0, in.length - 1);
    }
    //Creation using inorder..............................................................................................................

    private Node CreateBSTree(int[] in, int si, int ei) {

        if (si > ei) {
            return null;
        }
        Node n = new Node();

        int mid = (si + ei) / 2;
        n.val = in[mid];

        n.left = CreateBSTree(in, si, mid - 1);
        n.right = CreateBSTree(in, mid + 1, ei);
        return n;
    }

    //Displaying in pre-order..............................................................................................................

    public void in() {
        inorder(root);
    }

    private void inorder(Node root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + "->");
        inorder(root.right);

    }
    //Searching .................................................................................................................................

    public boolean find(int item) {
        return find(this.root, item);
    }

    private boolean find(Node node, int item) {//  O(log n)

        if (node == null) {
            return false;
        }
        if (node.val == item) {
            return true;
        }

        if (node.val > item)
            return find(node.left, item);
        else
            return find(node.right, item);

    }
    //Maximum...................................................................................................................................

    public int max() {
        return max(root);
    }

    private int max(Node node) { // O(log n)
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int Right = max(node.right);

        return Math.max(node.val, Right);
    }
    
    //Deletion.................................................................................................................................. 
    
    public void del(int item) {
         del(root, item);
    }

    private Node del(Node root, int key) {

        if (root == null) {
            return null;
        }

        if (root.val > key) {
            root.left=del(root.left, key);//delete from right sub-tree
        } else if (root.val < key) {
            root.right=del(root.right, key);//delete from left sub-tree
        } else {
            if (root.left != null && root.right != null) {
                int lmax = max(root.left);
                root.val = lmax;
                root.left=del(root.left, lmax);
            } else if (root.left != null) {
                return root.left;
            } else if (root.right != null) {
                return root.right;
            } else {
                return null;
            }
        }
        return root;
    }
}
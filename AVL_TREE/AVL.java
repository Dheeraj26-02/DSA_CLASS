
public class AVL {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){
        }
        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    private TreeNode root;

    public void insert(int val) {
        root = insert(root, val);
    }

    private TreeNode insert(TreeNode root, int val) {// O(log n)
        if (root == null) {
            TreeNode nn = new TreeNode();
            nn.val = val;
            return nn;
        }
        if (val > root.val) {
            root.right = insert(root.right, val);
        } else if (val < root.val) {
            root.left = insert(root.left, val);
        }
        return balance(root);

    }

    private TreeNode balance(TreeNode root) {// O(1)
        if ((height(root.left) - height(root.right)) > 1) {// left-left||left-right
            if (height(root.left.left) - height(root.left.right) > 0) {// left-left
                return rightRotate(root);
            }
            if (height(root.left.right) - height(root.left.left) > 0)// left-right
            {
                root.left = leftRotate((root.left));
                return rightRotate(root);
            }
        }
        if ((height(root.right) - height(root.left)) > 1) {// right-right
            if(height(root.right.right)-height(root.right.left)>0)
            {
                return rightRotate(root);
            }
            //left-right
            if (height(root.left.right) - height(root.left.left) > 0) {
                root.right = leftRotate((root.right));
                return rightRotate(root);

            }
        }
        return root;
    }

    public TreeNode leftRotate(TreeNode parent) {
        TreeNode child = parent.right;
        TreeNode t = child.left;
        child.left = parent;
        parent.right = t;
        return child;
    }

    public TreeNode rightRotate(TreeNode parent) {
        TreeNode child = parent.left;
        TreeNode t = child.right;
        child.right = parent;
        parent.left = t;
        return child;
    }
    public int height()
    {
        return height(root);
    }
    private int height(TreeNode node) {// O(n)
        if (root == null)
            return 0;
        int l = height(node.left);
        int r = height(node.right);
        return Math.max(l, r) + 1;
    }
}
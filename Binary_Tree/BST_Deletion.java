class BST_Deletion {
    class Node {
        int val;
        Node left, right;
    };

    public Node deleteNode(Node root, int key) {
        return del(root, key);
    }

    public Node del(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val > key) {
            root.left = del(root.left, key);
        } else if (root.val < key) {
            root.right = del(root.right, key);
        } else {
            if (root.left != null && root.right != null) {
                int lmax = max(root.left);
                root.val = lmax;
                root.left = del(root.left, lmax);
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

    public int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, max(root.right));
    }
}
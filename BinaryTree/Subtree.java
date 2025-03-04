//Subtree of another tree
public class Subtree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
            // cond:1-if root=null or subroot=null
            // cond:2-if root value !=subroot value
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        // cond:3-recursive method for left subtree if not identical for left
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }

        // cond:3-recursive method for right subtree if not identical for right
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        // check for subtree--(finding node)--if root value=subroot value then check for
        // isIdentical
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        // check if left subtree or right subtree
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // subTree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubTree(root, subRoot));

    }
}
// package BinaryTree;
public class heightofTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //****height**** 
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // *****count no of nodes*****
    public static int Count(Node root) {
        if (root == null) {
            return 0;
        }
        int lcount = Count(root.left);
        int rcount = Count(root.right);
        return lcount + rcount + 1;
    }

    // ****sum of nodes****
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return (leftSum + rightSum + root.data);
    }

    // we can also apply tree traversal like this
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Diameter of tree
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int ldiam=diameter(root.left);
        int rdiam=diameter(root.right);
        int lh=height(root.left);
        int rh=height(root.right);

        int self=lh+rh;
        return Math.max(self,Math.max(ldiam,rdiam));
    }

    public static void main(String[] args) {
        /*
         *    1
         *   / \
         *  2   3
         * / \ / \
         * 4 5 6 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of tree:");
        System.out.println(height(root));

        System.out.println("Number of nodes in tree:");
        System.out.println(Count(root));

        System.out.println("Sum of nodes:");
        System.out.println(sum(root));

        System.out.println("Diameter of tree:");
        System.out.println(diameter(root));
        // inorder(root);
    }

}

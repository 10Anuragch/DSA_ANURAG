public class mirrorBST {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    //complexity -->> O(n)
    public static Node Mirror(Node root){
        if (root==null) {
            return null;
        }
        Node left=Mirror(root.left);
        Node right=Mirror(root.right);

        root.left=right;
        root.right=left;
        return root;
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);

        root=Mirror(root);
        preOrder(root);
    }
}

// package BinaryTree;
import java.util.*;
import java.util.LinkedList;

public class BuildTreePreOrder {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }


        //****In tree the pre,post and in order trtaversals we uses DFS property using recursion****

        //PreOrder Traversal --> O(n)
        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+"  ");
            preOrder(root.left);
            preOrder(root.right);
        }

        //PostOrder traversal --> O(n)
        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"  ");
        }

        //inOrder Traversal --> O(n)
        public static void inOrder(Node root){
            if(root==null){
                return;
            }  
            inOrder(root.left); 
            System.out.print(root.data+"  ");
            inOrder(root.right);
        }

        //****In level oredr traversal we uses BFS property using itertive method****

        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+"  ");;
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    } 
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        // System.out.println("Root of the tree is = "+root.data);

        System.out.println("Pre Order Traversal");
        tree.preOrder(root);

        System.out.println();
        System.out.println("Post Order Traversal");
        tree.postOrder(root);

        System.out.println();
        System.out.println("In Order Traversal");
        tree.inOrder(root);

        System.out.println();
        System.out.println("Level Order Traversal");
        tree.levelOrder(root);
    }
}

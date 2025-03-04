import java.util.ArrayList;

public class buildBst {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // insertion in a Binary Search Tree

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // search in BST(complecity--O(h) in worst case and log n in best case )

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Deletion of a node in Binary Search Tree(Imp..)
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1 - Leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 - single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3 - both children
            Node Is = findInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }

    // find Inorder Successor

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // print in range

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    // print path from root to leaf

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
            ;
        }
        System.out.println("Null");
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    // validate BST(IMP)

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }

        //Approach -- >>
        //find max of left subtree and min of right subtree 
        //and node<min(right) && node>max(left) then this is valid BST

        if (min != null && root.data <= min.data){
            return false;
        } else if (max != null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left, min, root)//min value is min and max is root(left subtree)
                && isValidBST(root.right, root, max);//min is root and max is max(right subtree)
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        System.out.println("Elements of BST:");
        inorder(root);
        System.out.println();

        System.out.println();
        System.out.println("After performing Search in BST:");
        if (search(root, 6)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

        System.out.println();
        System.out.println("After performing Deletion in BST:");
        delete(root, 1);
        inorder(root);
        System.out.println();

        System.out.println();
        System.out.println("Elements of BST in the range");
        printInRange(root, 3, 8);

        System.out.println();
        System.out.println();

        System.out.println("paths from Root to Leaf:");
        printRootToLeaf(root, new ArrayList<>());

        System.out.println();
        System.out.println("BST is valid or not:");
        if (isValidBST(root, null, null)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }
}

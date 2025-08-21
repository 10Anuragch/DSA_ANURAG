public class CycleLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // detect cycle

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;// cycle exist
            }
        }
        return false;// cycle doesn't exist
    }

    // remove cycle

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // if cycle present then::
        // find meeting point
        slow = head;// ::step 1
        Node prev = null;// last node (prev node of fast where slow and fast meets)
        while (slow != fast) {
            prev = fast;
            slow = slow.next;// +1
            fast = fast.next;// +1
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = new Node(4);
        head.next.next.next = temp1;
        // 1->2->3->4->2
        System.out.println("check if cycle present = " + isCycle());
        removeCycle();
        System.out.println("After removing cycle");
        System.out.println("check if cycle present = " + isCycle());
    }
}
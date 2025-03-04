public class detectsCycle {
    static Node head = null;
    static Node tail = null;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    //main logic of detects cycle
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;// cycle exists
            }
        }
        return false;// cycle does not exist
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(isCycle());
    }

}

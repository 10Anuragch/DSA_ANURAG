
public class reverseLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlistReverse {
        static Node head = null;
        static Node tail = null;

        // insert at end

        void insertAtEnd(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }

        // display

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }

        // ***reverse function(M.IMP)***

        void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        // ***Check LL is Palindrome ***
        /*
         * step:1-find mid node
         * step:2-reverse 2nd half
         * step:3-check equality of both half
         */

        public Node findMid(Node head) {// helper function
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;// +1
                fast = fast.next.next;// +2
            }
            return slow;// slow is my midNode
        }

        public boolean checkPalindrome() {
            if (head == null || head.next == null) {
                return true;
            }
            // step::1-find midNoode
            Node midNode = findMid(head);

            // step::2-reverse second half
            Node prev = null;
            Node curr = midNode;// since we are reversing second half so initial node is midNode
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node right = prev;// right half ka head = prev
            Node left = head;// left half ka head

            // step::3-check equality of both halfs
            while (right != null) {
                if (left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        linkedlistReverse lr = new linkedlistReverse();

        lr.insertAtEnd(1);
        lr.insertAtEnd(2);
        lr.insertAtEnd(3);
        lr.insertAtEnd(4);
        lr.insertAtEnd(5);
        lr.display();

        System.out.println();

        System.out.println("Reversed Linked List");

        lr.reverse();
        lr.display();

        System.out.println();
        System.out.println("isPalindoeme - " + lr.checkPalindrome());
    }
}

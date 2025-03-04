// package LinkedList;
// import java.util.*;

public class InsertionInLL {
    public static class Node {
        int data;
        static Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        static Node head = null;
        static Node tail = null;

        // insretion at end

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            // for empty list
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // Insertion at begining
        void insertAtBeg(int val) {
            Node temp = new Node(val);
            // for empty list
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
            }
            head = temp;
        }

        // insertion at particular index

        void insertAtIndex(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            // at end
            if (idx == size()) {
                insertAtEnd(val);
                return;
            }
            // at begining
            else if (idx == 0) {
                insertAtBeg(val);
                return;
            }
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        // display

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }

        // size

        public static int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // search function(Iterative approach)

        public static int search(int key) {
            Node temp = head;
            int i = 0;
            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            //key not found
            return -1;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        // insert at last

        System.out.println("List after insertion at end:");

        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(9);
        ll.insertAtEnd(10);

        ll.display();

        System.out.println();
        // size of linked list
        System.out.println("Length of linked list = " + ll.size());

        System.out.println();

        // insert at beg

        System.out.println("List After insertion at begining:");

        ll.insertAtBeg(3);
        ll.insertAtBeg(2);
        ll.insertAtBeg(1);

        ll.display();

        System.out.println();
        // size of linked list
        System.out.println("Length of linked list = " + ll.size());

        System.out.println();

        // insertion at particular index
        System.out.println("List After insertion at particular index:");
        ll.insertAtIndex(5, 6);
        ll.insertAtIndex(9, 11);// check for last index

        ll.display();

        System.out.println();
        // size of linked list
        System.out.println("Length of linked list = " + ll.size());

        System.out.println(ll.tail.data);
        System.out.println(ll.head.data);

        System.out.println("The index of searched key is: " + ll.search(6));
        System.out.println("The index of searched key is: " + ll.search(10));

    }
}
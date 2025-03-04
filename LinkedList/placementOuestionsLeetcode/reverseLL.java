
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

        //***reverse function(M.IMP)***

        void reverse(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
            while (curr!=null) {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
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
    }
}

public class DeletionDll {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
        //insertion at  head
        public static Node insertAtBeg(Node head,int x){
            Node t = new Node(x);
            t.next = head;
            head.prev = t;
            head = t;
            return head;
        }    }

    //deletion from head
    public static Node deleteFromHead(Node head){
        if (head == null) {
            System.out.println("List is empty. No node to delete.");
            return ;
        }

        // If the list has only one node
        if (head.next == null) {
            head = null;
        } else {
            head = head.next; // Move head to the next node
            head.prev = null; // Set the new head's previous pointer to null
        }

        System.out.println("Node deleted from head.");
    
    }
    //display
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        System.out.println("Original LinkedList: ");
        display(a);

        System.out.println("After deletion: ");
        display(a);
    }
}

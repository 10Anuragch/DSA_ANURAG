//remove nth from last and return head
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next=next;
    }
}
public class Q2{
    
    public static  Node removeNthFromEnd(Node head, int n) {
        // Create a dummy node that points to the head of the list
      Node dummy = new Node(0);
      dummy.next = head;
      
      // Initialize two pointers: fast and slow
      Node fast = dummy;
      Node slow = dummy;

      // Move the fast pointer n steps ahead
      for (int i = 0; i < n + 1; i++) {
          fast = fast.next;
      }

      // Move both fast and slow pointers until fast reaches the end
      while (fast != null) {
          fast = fast.next;
          slow = slow.next;
      }

      // Remove the nth node from the end
      slow.next = slow.next.next;

      // Return the head of the modified list (dummy.next)
      return dummy.next;
  }
  public static void main(String[] args) {
    Node a=new Node(1);
    Node b=new Node(2);
    Node c=new Node(3);
    Node d=new Node(4);
    Node e=new Node(5);
    b=a.next;
    c=b.next;
    d=c.next;
    e=d.next;
    System.out.println(removeNthFromEnd(e, 2));
  }
}
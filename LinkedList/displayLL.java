// package LinkedList;

public class displayLL {
/* 
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
       }
*/

    //display recursively

    public static void displayR(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+"->");
        displayR(head.next);
    }


/* 
    [Print Linked List in reverse order recursively]  by changing only one statemnet -- 
    first call the recursive method then print data

    public static void displayR(Node head){
        if(head==null){
            return;
        }
        displayR(head.next);
        System.out.print(head.data+"->");
    }
*/

   public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
       }
           
        public static void main(String[] args) {
            Node a=new Node(5);
            Node b=new Node(10);
            Node c=new Node(15);
            Node d=new Node(20);
            Node e=new Node(100);

            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;

            // display(a);
            
            displayR(a);

    }
}

// package LinkedList;

public class lengthOfLL {
    public static int length(Node head){
        Node temp=head;
        int count=0;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
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
        Node e=new Node(25);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;


       System.out.println("Length of Linked List is = "+length(a));
    }
}

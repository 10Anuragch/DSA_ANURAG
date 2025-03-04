// package Doubly linkedlist;

public class insertionDll {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }    

        //insertion at head

        public static Node insertAtBeg(Node head,int x){
            Node t = new Node(x);
            t.next = head;
            head.prev = t;
            head = t;
            return head;
        }
    

        //insertion at tail 

        public static void insertAtTail(Node head,int x){
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node t=new Node(x);
            temp.next=t;
            t.prev=temp;
        }
        //insertion at particular index
        public static void insertAtIndex(Node head,int idx,int x){
            Node s=head;
            for(int i=1;i<=idx-1;i++){
                s=s.next;
            }
            //s is at idx-1 position
            Node r=s.next;//idx position
            Node t=new Node(x);
            s.next=t;
            t.prev=s;
            t.next=r;
            r.prev=t;
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

        display(a);


        System.out.println("After inserting the value at head");

        Node newhead=insertAtBeg(a,35);

        display(newhead);


        System.out.println("After inserting the value at tail");

        insertAtTail(a, 900);

        display(a);

        System.out.println("After inserting the value at particular index");

        insertAtIndex(a, 3, 55);

        display(a);
    }
}
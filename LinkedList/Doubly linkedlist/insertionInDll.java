// package Doubly linkedlist;
public class insertionInDll {
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    // public static class DoublyLL{
        public static Node head;
        public static Node tail;
        public static Node prev;

        //insertion at first

        public void addAtFirst(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }

        //insert at last

        public void addAtLast(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    
     //display
     public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //size
    public static void size(Node head){
        Node temp=head;
        int count=0;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        System.out.println("Size of LL is: "+count);
    }

    //reverse a Doubly Linkedlist

    void reverseDll(){
        Node curr=head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;//additional to the reverse in singular ll
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        insertionInDll dll=new insertionInDll();
        System.out.println("Insert at first **");
        dll.addAtFirst(5);
        dll.addAtFirst(4);
        dll.addAtFirst(3);
        dll.addAtFirst(2);
        dll.addAtFirst(1);
        dll.display(head);
        dll.size(head);

        System.out.println();


        System.out.println("Insert at Last **");
        dll.addAtLast(60);
        dll.addAtLast(70);
        dll.addAtLast(80);
        dll.display(head);
        dll.size(head);

        System.out.println();


        System.out.println("Reversed LL **");
        dll.reverseDll();
        dll.display(head);
        dll.size(head);

}
}
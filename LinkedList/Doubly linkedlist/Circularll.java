//singular circular linkedlist -- in this we connect last node with first node
public class Circularll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        static Node head=null;
        static Node tail=null;
        
        //Insertion at begining
        void insertAtBeg(int val){
            Node temp=new Node(val);
            //for empty list
            if(head==null){
                head=temp;
            }
            else{
                temp.next=head;
            }
            head=temp;
        }

        //display
        public static void display(Node head){
            Node temp=head.next;
            while(temp!=head){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;

        display(a);
    }
    }
}

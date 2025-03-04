// package LinkedList;

public class deletionInLL {
    public static class Node {
        int data;
        Node next;

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

        //deletion from start

        void deleteFromBeg(){
            head=head.next;
        }


        //deletion from last

        void deleteFromEnd(){
            Node temp=head;
            for(int i=0;i<size()-2;i++){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }


        // deletion from a particular index

       void deleteFromIndex(int idx){
        if(idx==0){
            head=head.next;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
       }

        // display

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }

         //size
        
         public static int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();

        System.out.println();

        ll.deleteFromIndex(2);
        ll.display();

        System.out.println();

        ll.deleteFromBeg();
        ll.display();

        System.out.println();

        ll.deleteFromEnd();
        ll.display();
    }
}

/*
 * Problem-- the problem is to find Nth from last and remove them
 */
public class deleteNthFromLast {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class linkedlist{
        static Node head=null;
        static Node tail=null;

        //insert at end
        void insertAtEnd(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
            }
            else{
                tail.next=newNode;
            }
            tail=newNode;
        }

        //display
        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }


        //find Nth from last and remove them

        void removeNthFromLast(int N){
            /*step.1:calcuate size
             *step.2:find idx to remove
             *       where nth from last=size-n+1 from starting so
             *       we have to find idx and initialize idxToFind with size-n
             *step.3:and then we execute a loop till prev of element to be removed
            */

            //**calculate size

            int size=0;//initialize size
            Node temp=head;
            while (temp!=null) {
                temp=temp.next;
                size++;
            }

            if(N==size){//if we want to remove nth from last where n=size means remove first
                head=head.next;//remove first
                return;
            }

            //**find nth from last

            //size-n

            int idx=1;
            int idxToFind=size-N;
            Node prev=head;
            while (idx<idxToFind) {
                prev=prev.next;
                idx++;
            }
            //**remove nth from last
            prev.next=prev.next.next;
        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();

        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();

        System.out.println();

        System.out.println("remove nth from last");
        
        ll.removeNthFromLast(3);
        ll.display();
    }
}

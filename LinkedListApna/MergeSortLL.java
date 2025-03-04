public class MergeSortLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    //add last
    public void addLast(int data) {
        // step1 - create newNode
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - tail ke next se new Node ko link kro
        tail.next = newNode;
        // step3 - new Node ko tail bnao
        tail = newNode;
    }
    // print a ll
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //merge sort on linkedlist
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//mid node
    }

    public Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next ;
            }
        }
        while(head1!=null){
            temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while (head2!=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next ;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left & right MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);
    }

    public static void main(String[] args) {
        MergeSortLL ll=new MergeSortLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(9);
        ll.addLast(11);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(10);
        ll.addLast(7);
        ll.addLast(5);
        ll.print();

        ll.head=ll.mergeSort(ll.head);
        ll.print();
    }
}

// package LinkedListApna;

public class LinkedList {
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

    // add first
    public void addFirst(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 - newNode next=head
        newNode.next = head;
        // step 3 - head=newNode
        head = newNode;
    }
      //reverse a ll
      public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // add in the middle

    public void addatIdx(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i=idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // add last

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

    // size of ll
    public void size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.println("Size = " + count);
    }

    // ---->>>Deletion in LinkedList <<<<-----//

    // delete node from head
    public void removeHead() {
        head = head.next;
    }

    // delete from last
    public void removeLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // function for search the key

    public int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;// if key not find
    }
  


    //Most Imp. -- Find and remove Nth node from last //

    public void deleteNthLast(int n){
        //calculate size
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;//remove first
            return;
        }
        //size-n
        int i=1;
        int idxToFind=size-n;
        Node prev=head;
         while(i<idxToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //check if palindrome--
    //helper fun to find mid node
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }

//to check palindrome
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //1.find mid
        Node midNode=findMid(head);
        //2.reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;//right half head
        Node left=head;//left half head
        //3.check left and right
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

        System.out.println("Add first");
        ll.print();
        ll.size();

        System.out.println("Reversed Linkedlist");
        ll.reverse();
        ll.print();

        ll.addLast(0);
        ll.addLast(-1);
        ll.addLast(-2);
        ll.addLast(-3);

        System.out.println("Add Last");
        ll.print();
        ll.size();

        ll.addatIdx(9, 2);
        System.out.println("Add Middle");
        ll.print();
        ll.size();

        // remove head
        System.out.println("After deletion from head");
        ll.removeHead();
        ll.print();
        ll.size();

        // remove last
        System.out.println("After deletion from last");
        ll.removeLast();
        ll.print();
        ll.size();

        System.out.println("index of " + 2 + " is = " + ll.search(2));
        System.out.println("index of " + 0 + " is = " + ll.search(0));


        System.out.println("Delete nth from last");
        ll.deleteNthLast(3);
        ll.print();

        LinkedList Li=new LinkedList();
        Li.addLast(1);
        Li.addLast(2);
        Li.addLast(2);
        Li.addLast(1);
        System.out.println("Another LinkedList");
        Li.print();
        Li.size();
        System.out.println("check palindrome");
        System.out.println(Li.checkPalindrome());
    }
}

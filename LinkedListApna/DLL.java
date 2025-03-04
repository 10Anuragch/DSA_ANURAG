public class DLL {
    public static class Node {
        int data;
        Node next;
        Node prev;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev=null;
    }
}
public static Node head;
public static Node tail;
public static int size;

//add first

public void addFirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head.prev=newNode;
    head=newNode;
}

public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp=temp.next;
    }
    System.out.println("null");
}

//remove from head

public void removeFirst(){
    size--;
    if(head==null){
        System.out.println("LL is empty");
        return;
    }
    head=head.next;
    head.prev=null;
}

//add last

public void addLast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
    }
    tail.next=newNode;
    newNode.prev=tail;
    tail=newNode;
}

//remove last

public void removeLast(){
    size--;
    if(head==null){
        System.out.println("LL is empty");
        return;
    }
   tail.prev.next=null;
}

//reverse a DLL

public void reverse(){
    Node curr=head;
    Node prev=null;
    Node next;

    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;

    }
    head=prev;
}


    public static void main(String[] args) {
        DLL ll=new DLL();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println("Size of ll after add node at head = "+ll.size);

        System.out.println();

        ll.removeFirst();
        ll.print();
        System.out.println("Size of ll after remove from head = "+ll.size);


        System.out.println();

        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        System.out.println("Size of ll after add node to the last = "+ll.size);


        System.out.println();

        ll.removeLast();
        ll.print();
        System.out.println("Size of ll after deletion from last node = "+ll.size);


        System.out.println();
        
        System.out.println("Reversed Dll");
        ll.reverse();
        ll.print();
    }
}

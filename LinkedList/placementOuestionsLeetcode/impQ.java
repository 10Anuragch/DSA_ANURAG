//Flatten a doubly linked list
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class impQ {
    public Node flatten(Node head) {
     Node temp = head; 
     while(temp!=null){
        Node t=temp.next;
        if(temp.child!=null){
            Node c = flatten(temp.child);
             temp.next=c;
             c.prev=temp;
             while(c.next!=null){
                c=c.next;
             }
             c.next=t;
             if(t!=null){
                t.prev=c;
             }
        }
        temp.child=null;//very imp make childs of all null
        temp=t;
     }
     return head;
    }
    public static void main(String[] args) {
        
    }
}
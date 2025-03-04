//Delete a node in a Linked List

/* 
Definition for singly linkedlist 
public class ListNode{  //ListNode can be replaced by Node
    int val;                                             //val can be replaced by data
    ListNode next;
  ListNode(int x) {val=x;}
}*/

public class Q1 {
  public void deleteNode(ListNode node) {
    node.val=node.next.val;
    node.next=node.next.next;
  }

  public static void main(String[] args) {

  }
}
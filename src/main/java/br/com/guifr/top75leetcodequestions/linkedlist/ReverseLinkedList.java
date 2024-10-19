package br.com.guifr.top75leetcodequestions.linkedlist;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if(head == null) return null;

        ListNode newNode = new ListNode(head.val,null);

        while(head.next != null){

            newNode = new ListNode(head.next.val,newNode);

            head = head.next;

        }

        head = newNode;

        return head;
    }

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}
